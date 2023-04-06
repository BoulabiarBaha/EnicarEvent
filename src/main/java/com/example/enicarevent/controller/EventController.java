package com.example.enicarevent.controller;

import com.example.enicarevent.model.Evenement;
import com.example.enicarevent.model.Utilisateur;
import com.example.enicarevent.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Event")
@CrossOrigin
public class EventController {
@Autowired
    private EventService eventservice;

    @PostMapping("/add")
    public String add(@RequestBody Evenement evenement) {
        eventservice.saveEvenement(evenement);
        return "new evenement added";
    }

    @GetMapping("getAll")
    public List<Evenement> getAllevent() {
         return eventservice.getEvents();
    }
}
