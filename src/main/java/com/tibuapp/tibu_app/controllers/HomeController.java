package com.tibuapp.tibu_app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tibuapp.tibu_app.Models.User;

@Controller
// especifica una url adicional
// @RequestMapping("/api")
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        User user = new User("Elidallana", "Cristancho", "cristanchodayana062017@gmail.com");
        Map<String, Object> datos = new HashMap<>();
        datos.put("user", user);
        datos.put("nombre", user.getName());
        datos.put("apellido", user.getLastname());
        datos.put("email", user.getEmail());
        model.addAttribute("datos", datos);
        // body.put("autor", "Elidallana Cristancho Caceres");
        // body.put("user", user);
        // model.addAttribute();
        // model.addAttribute();
        return "index";
    }
}
