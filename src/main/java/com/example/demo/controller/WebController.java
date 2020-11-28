package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class WebController {
    @Autowired
    private WebService webService;

    /**
     * find one student by id
     * @param id
     * @return
     */
    @GetMapping("/students/{id}")
    public Student findById(@PathVariable Long id){
        return webService.findById(id);
    }

    /**
     * find all students
     * @return
     */
    @GetMapping("/students")
    public List<Student> findAll(){
        return webService.findAll();
    }

    /**
     * save student information
     * @param student
     * @return
     */
    @PostMapping("/students")
    public Student save(Student student){
        return webService.save(student);
    }

    /**
     * update student information
     * also use save method
     * @param student
     * @return
     */
    @PutMapping("/students")
    public Student update(Student student){
        return webService.save(student);
    }

    /**
     * delete by id
     * @param id
     */
    @DeleteMapping("/students/{id}")
    public void deleteById(@PathVariable Long id){
        webService.deleteById(id);
    }

    /**
     * get students information for students less than certain age
     * @param age
     * @return
     */
    @GetMapping("/studentsInfo/{age}")
    public List<Student> getBelowAge(@PathVariable int age){
        return webService.getBelowAge(age);
    }

}
