package com.example.demo.service;

import com.example.demo.dao.WebRepository;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebServiceImpl implements WebService {
    @Autowired
    private WebRepository webRepository;


    @Override
    public Student findById(Long id) {
        return webRepository.findById(id).orElse(null);

    }

    @Override
    public List<Student> findAll() {
        return webRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return webRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        webRepository.deleteById(id);
    }

    @Override
    public List<Student> getBelowAge(int age) {
        return webRepository.getBelowAge(age);
    }
}
