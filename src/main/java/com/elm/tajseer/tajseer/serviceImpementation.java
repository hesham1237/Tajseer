package com.elm.tajseer.tajseer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpementation implements service {
    @Autowired
    private Repositry repo;

    @Override
    public void addStudent(Student student) {
        repo.save(student);

    }

    @Override
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return repo.findById(id).get();
    }
    @Override
    public void deleteStudent(int id) {
         repo.deleteById(id);
    }

}
