package com.spring.excep.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.excep.model.Student;


@Repository
public interface Studentdao extends MongoRepository<Student, Integer>
{

}
