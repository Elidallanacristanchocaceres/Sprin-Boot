package com.tibuapp.tibu_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Desarrollo de aplicaciones co spring boot TibuApp - Home");
        model.addAttribute("autor", "Elidallana Cristancho Caceres");
        return "index";
    }
}
