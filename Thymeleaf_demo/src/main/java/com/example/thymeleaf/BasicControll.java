package com.example.thymeleaf;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicControll {


    @RequestMapping("/helloWorld")
    public String HelloWorld(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        return "helloWorld.html";
    }

    @RequestMapping("/testing")
    public String testing(){
        return "index";
    }

}


