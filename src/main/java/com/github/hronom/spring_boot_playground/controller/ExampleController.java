package com.github.hronom.spring_boot_playground.controller;

import com.github.hronom.spring_boot_playground.service.ExampleAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ExampleController {
    private final ExampleAService exampleAService;

    @Autowired
    public ExampleController(ExampleAService exampleAService) {
        this.exampleAService = exampleAService;
    }

    @PostMapping("/test")
    public ResponseEntity<Void> test() {
        exampleAService.test();
        return ResponseEntity.ok().build();
    }
}
