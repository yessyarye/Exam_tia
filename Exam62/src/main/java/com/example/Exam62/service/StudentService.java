package com.example.Exam62.service;

import com.example.Exam62.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int Id);
}
