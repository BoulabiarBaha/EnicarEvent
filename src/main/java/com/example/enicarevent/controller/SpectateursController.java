package com.example.enicarevent.controller;

import com.example.enicarevent.model.Spectateurs;
import com.example.enicarevent.service.SpectateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spectateurs")
@CrossOrigin
public class SpectateursController {
    @Autowired
    private SpectateursService spectateursService;



    @PostMapping("/add")
    public String add(@RequestBody Spectateurs spectateurs) {
        spectateursService.saveSpectateur(spectateurs);
        return "new Spectateur added";
    }
    @GetMapping("/idevenement/{id}")
    public List<Spectateurs> getSpectateursByIdevenement(@PathVariable int id) {
        return spectateursService.getSpectateursByIdevenement(id);
    }
}
