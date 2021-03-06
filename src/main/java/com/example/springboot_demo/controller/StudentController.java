package com.example.springboot_demo.controller;

import com.example.springboot_demo.domain.Student;
import com.example.springboot_demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Student 控制器
 */
@Controller
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students",students);

        students.forEach(System.out::println);

        return "studentList";
    }
}
