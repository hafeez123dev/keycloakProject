package com.konic.keycloakproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keycloak")
public class keycloakController {

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminDetails() {
        return ResponseEntity.ok("Admin accessed");
    }
    @GetMapping("/user")
    public ResponseEntity<String> getUserDetails() {
        return ResponseEntity.ok("User accessed");
    }
}
