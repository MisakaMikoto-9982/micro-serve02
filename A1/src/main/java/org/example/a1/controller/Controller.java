package org.example.a1.controller;

import org.example.a1.service.A1Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class Controller {
    @Resource
    private A1Service a1Service;

//    Optional<Student> findAllStudent() {
//        return a1Service.findAllStudent();
//    }
//    @GetMapping("/A1/{ID}")
//    int getStudentAge(@PathVariable String ID) {
//        System.out.println(a1Service.getStudnetAge(ID));
//        return a1Service.getStudnetAge(ID);
//    }
    @GetMapping("/A1/{ID}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> getStudentAge(@PathVariable String ID) {
        int age = a1Service.getStudnetAge(ID);
        System.out.println(age);
        if (age >= 0) {
            System.out.println(111);
            System.out.println("{\"age\": " + age + "}");
            return ResponseEntity.ok().body("{\"age\": " + age + "}");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"User not found\"}");
        }
    }
}
