package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class RestControll {


    //public RestControll() throws IOException {
    //}

    @GetMapping("/getAll")
    public String getAllTemps(Model model) throws IOException {
        Repo re = new Repo();
        List<Temps> TempList = re.getValues();
        model.addAttribute("TempList", TempList);
        return "index";
    }

}

