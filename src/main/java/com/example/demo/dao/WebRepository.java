package com.example.demo.dao;

import com.example.demo.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WebRepository extends JpaRepository<Student, Long> {
    @Query(value = "SELECT * FROM student WHERE age < ?1", nativeQuery = true)
    List<Student> getBelowAge(int age);
}
