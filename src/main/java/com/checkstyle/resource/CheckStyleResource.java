package com.checkstyle.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkstyle")
public class CheckStyleResource {

    @GetMapping
    public ResponseEntity<String> hello() {
        final var helloVariable = "Hello Word";
        return ResponseEntity.ok(helloVariable);
    }
}
