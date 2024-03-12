package org.example.a1.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(value = "B1")
public interface A1Service {
//    Optional<Student> findAllStudent();

    @GetMapping("/B1/{ID}")
    int getStudnetAge(@PathVariable(value = "ID") String ID);
}
