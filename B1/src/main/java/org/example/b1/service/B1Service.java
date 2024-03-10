package org.example.b1.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(value = "C1")
public interface B1Service {

//    @GetMapping("C1/findall")
//    Optional<Student> findAllStudent();

    @GetMapping("/C1/{ID}")
    int getStudentAge(@PathVariable(value = "ID") String ID);
}
