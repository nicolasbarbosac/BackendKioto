package com.kioto.api.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/")
    ResponseEntity sample() {
        return ResponseEntity.ok().build();
    }
}