package com.example.Exam62.dao;

import com.example.Exam62.entity.Student;

import java.util.List;

public interface StudentDao {
    Student findById(Integer id);
    List<Student> findAll();
}
