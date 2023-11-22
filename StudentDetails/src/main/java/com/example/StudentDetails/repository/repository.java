package com.example.StudentDetails.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentDetails.entity.Student;

@Repository
public interface repository extends MongoRepository<Student,Integer> {

}
