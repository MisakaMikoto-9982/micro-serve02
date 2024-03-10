package org.example.b1.controller;


import org.example.b1.service.B1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class Controller {
    @Resource
    private B1Service b1Service;

    @GetMapping("/B1/{ID}")
    public int getStudentAge(@PathVariable String ID){
        return b1Service.getStudentAge(ID);
    }

//    @GetMapping("/B1/findall")
//    public Optional<Student> findAllStudent() {
//        return b1Service.findAllStudent();
//    }

}
