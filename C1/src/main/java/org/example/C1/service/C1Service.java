package org.example.C1.service;

import org.example.C1.entity.Student;

import java.util.List;

public interface C1Service {
    List<Student> findAllStudent();

    int getStudentAge(String ID);
}
