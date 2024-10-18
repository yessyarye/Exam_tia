package com.example.Exam62.dao;

import com.example.Exam62.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public Student findById(Integer id) {
        //get student
        Student theStudent = entityManager.find(Student.class, id);
        return theStudent;
    }

    @Override
    @Transactional
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
        // execute query and get result list
        List<Student> students = theQuery.getResultList();
        // return the results
        return students;
    }
}
