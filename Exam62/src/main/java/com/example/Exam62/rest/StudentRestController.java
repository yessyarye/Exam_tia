package com.example.Exam62.rest;

import com.example.Exam62.entity.Student;
import com.example.Exam62.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    // Endpoint untuk mendapatkan semua student
    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public ResponseEntity<Student> findStudentById(@PathVariable int studentId) {
        Student student = studentService.findById(studentId);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build(); // Jika student tidak ditemukan
        }
    }
}
