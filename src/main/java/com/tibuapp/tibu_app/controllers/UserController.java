package com.tibuapp.tibu_app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tibuapp.tibu_app.Models.User;
import com.tibuapp.tibu_app.Models.Dtos.UserDto;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserController {

@GetMapping("/")
    public UserDto index() {
        UserDto userDto = new UserDto();
        User user = new User("Elidallana", "Cristancho", "cristanchodayana062017@gmail.com");
        userDto.setTitle("Ingeniero de sistemas fullstack");
        userDto.setUser(user);

        return userDto;
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping("/list")
    public List<User> listusers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Eldiallana", "Cristancho", "cristanchodayana062017qgmail.com"));
        users.add(new User("Martha", "Romero", "mart@gmail.com"));
        return users;
    }
}
