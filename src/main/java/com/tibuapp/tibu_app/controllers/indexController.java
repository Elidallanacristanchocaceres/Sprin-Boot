package com.tibuapp.tibu_app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tibuapp.tibu_app.Models.User;



@Controller
// especifica una url adicional
//@RequestMapping("/api")
public class indexController {
    
    @GetMapping("/")
    public String index(Model model) {
        User user = new User("Elidallana", "Cristancho", "cristanchodayana062017@gmail.com");
        //Map<String,Object> map = Map.of(
        //    "title", "Desarrollo de aplicaciones co spring boot TibuApp - Home",
        //    "autor", "Elidallana Cristancho Caceres"
        //    );
           // Map<String,Object> datos = new HashMap<>();
            model.addAttribute("user", user);
           // datos.addAttribute("datos", datos);
            //body.put("autor", "Elidallana Cristancho Caceres");
            //body.put("user", user);
        //model.addAttribute();
        //model.addAttribute();
        return "index";
    }
}
