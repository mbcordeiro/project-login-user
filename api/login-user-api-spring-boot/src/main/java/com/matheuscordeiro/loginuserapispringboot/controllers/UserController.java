package com.matheuscordeiro.loginuserapispringboot.controllers;

import com.matheuscordeiro.loginuserapispringboot.entities.User;
import com.matheuscordeiro.loginuserapispringboot.services.interfaces.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findUserByIdOrThrow(id).get());
    }

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        return ResponseEntity.ok(userService.findUserByEmailOrThrow(email));
    }

    @PostMapping("/login")
    public void signUp(@RequestBody User user) {
        userService.signUpOrThrow(user);
    }
}
