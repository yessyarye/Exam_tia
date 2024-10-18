package com.example.Exam62.service;
import com.example.Exam62.dao.StudentDao;
import com.example.Exam62.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
    return studentDao.findAll();
    }

    @Override
    public Student findById(int Id) {
        return studentDao.findById(Id);
    }


}