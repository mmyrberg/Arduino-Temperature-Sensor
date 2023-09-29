package com.example.thymeleaf;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class BasicControll {


    @RequestMapping("/getLatest")
    public List<Temps> getLatest () throws IOException {
        Repo re = new Repo();
        List<Temps> TempList = re.getValues();
        return TempList;
    }



}


