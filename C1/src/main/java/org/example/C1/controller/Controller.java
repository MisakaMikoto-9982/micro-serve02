package org.example.C1.controller;

import org.example.C1.entity.Student;
import org.example.C1.service.C1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/C1")
public class Controller {

    @Resource
    private C1Service c1Service;

    @GetMapping("/{ID}")
    public int getStudentAge(@PathVariable String ID){
        return c1Service.getStudentAge(ID);
    }

    @GetMapping("/findall")
    public List<Student> findAllStudnet(){
        return c1Service.findAllStudent();
    }

}
