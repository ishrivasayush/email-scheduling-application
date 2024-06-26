package com.narainox.mailSchedulerApplication.controller;

import com.narainox.mailSchedulerApplication.model.User;
import com.narainox.mailSchedulerApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> createUserHandler(@RequestBody User user)
    {
        User use = userService.createUser(user);
        return new ResponseEntity<>(use, HttpStatus.CREATED);
    }
}
