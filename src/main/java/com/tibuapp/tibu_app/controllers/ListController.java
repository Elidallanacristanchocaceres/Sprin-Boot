package com.tibuapp.tibu_app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tibuapp.tibu_app.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/api")
public class ListController {

    @GetMapping("/list-users")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
            new User("Alan", "Corzo"),
            new User("Dayana", "Caceres"),
            new User("Karen", "Caceres")
        );
        model.addAttribute("title", "Lista de usuarios");
        model.addAttribute("users", users);
        return "list";
    }    
}
