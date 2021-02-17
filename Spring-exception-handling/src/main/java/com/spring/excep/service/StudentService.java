package com.spring.excep.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.excep.dao.Studentdao;
import com.spring.excep.exception.MyRecordNotFoundException;
import com.spring.excep.exception.NoRecordExistException;
import com.spring.excep.model.Student;

@Component
public class StudentService {

	@Autowired
	private Studentdao dao;

	public int insert(Student std) {
		System.out.println("Record Added" + std.toString());
		dao.save(std);
		return std.getStdId();
	}

	public void insertAll(List<Student> std) {
		System.out.println("Record Added" + std.toString());
		dao.saveAll(std);
	}

	public List<Student> getAll() throws NoRecordExistException {
		System.out.println("All Record Searched");
		List<Student> list = dao.findAll();
		if (!list.isEmpty())
			return list;
		else {
			System.out.println("Exception Occured");
			throw new NoRecordExistException("No Record Exist in DB");
		}
	}

	public Student getById(@PathVariable int id) throws MyRecordNotFoundException {
		System.out.println("Record Searched");
		Optional<Student> s = dao.findById(id);
		if (s.isPresent())
			return s.get();
		else {
			System.out.println("Exception Occured");
			throw new MyRecordNotFoundException("Record with id " + id + " not found.");
		}
	}

	public int delete(@PathVariable int id) {
		System.out.println("Record Deleted");
		dao.deleteById(id);
		return id;
	}

	public void deleteMany(List<Integer> ids) {
		for (Integer id : ids)
			dao.deleteById(id);
	}

	public void deleteAll() {
		dao.deleteAll();
	}

	public List<Student> getHighestMark(int mark) throws NoRecordExistException // Get when Total > mark
	{
		List<Student> stds = getAll();
		List<Student> finalList = new ArrayList<Student>();
		for (Student std : stds) {
			if (std.getStdTotal() > mark)
				finalList.add(std);
		}
		return finalList;
	}

	public List<Student> getTopper() throws NoRecordExistException {
		List<Student> stds = getAll();
		List<Student> finalList = new ArrayList<Student>();
		for (Student std : stds) {
			if (std.getStdGrade() == "S")
				finalList.add(std);
		}
		return finalList;
	}

}
