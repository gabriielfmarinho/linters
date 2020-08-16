package com.checkstyle.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/checkstyle")
public class CheckStyleResource {

    @GetMapping
    public ResponseEntity<String> hellow(final String name, final String lastName) {
        final List<String> lsit = null;
        final var variable = "Hello Word";
        return ResponseEntity.ok(variable);
    }
}
