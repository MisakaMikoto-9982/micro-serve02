package org.example.C1.service.C1ServiceImpl;

import org.example.C1.entity.Student;
import org.example.C1.repository.C1Repository;
import org.example.C1.service.C1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class C1ServiceImpl implements C1Service {

    private final C1Repository c1Repository;

    @Autowired
    public C1ServiceImpl(C1Repository c1Repository){
        this.c1Repository = c1Repository;
    }
    @Override
    public List<Student> findAllStudent() {
        return c1Repository.findAll();
    }

    @Override
    public int getStudentAge(String ID) {
        Optional<Student> studentOptional = c1Repository.findById(ID);
        if(studentOptional.isPresent()){
            int age = studentOptional.get().getAge();
            System.out.println(age);
            return age;
        }else{
            System.out.println(0);
            return 0;
        }
    }
}
