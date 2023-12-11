package com.mylearning.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn")
@Slf4j
public class LearningController {
    @Value("${test.value}")
    String value;
    @GetMapping("/test")
    public ResponseEntity<String> getLearning(@RequestParam String param){
        log.info("this is log {} param {} ", value, param);
        return ResponseEntity.ok("Learning Controller "+value + " " + param);
    }
}
