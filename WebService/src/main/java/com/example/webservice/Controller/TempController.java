package com.example.webservice.Controller;

import com.example.webservice.Model.Temp;
import com.example.webservice.Repo.TempRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Temperature")
public class TempController {
    private final TempRepo repo;

    public TempController(TempRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/get")
    public List<Temp> getTemp () {
        return repo.findAll();
    }

    @PostMapping("/add")
    public String addTemp (@RequestBody Temp t) {
        repo.save(t);
        return "Temperaturen laddas in till DB";
    }

    @RequestMapping("/{id}")
    public Temp findById(@PathVariable long id) {
        //log.info("Temp found with id"+" "+id);
        return repo.findById(id).get();
    }
}
