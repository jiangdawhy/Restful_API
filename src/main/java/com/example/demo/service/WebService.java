package com.example.demo.service;

import com.example.demo.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface WebService {
    public Student findById(Long id);

    public List<Student> findAll();

    public Student save(Student student);

    void deleteById(Long id);

    List<Student> getBelowAge(int age);
}
