package com.elm.tajseer.tajseer;

import java.util.List;

public interface service {
    public void addStudent(Student student);
    public List<Student> getStudents();
    public Student getStudent(int id);
    public void deleteStudent(int id);
    public Student udateStudent(Student student,int id);

}
