package com.example.enicarevent.service;

import com.example.enicarevent.model.Evenement;



import java.util.List;


public interface EventService {


    public Evenement saveEvenement(Evenement evenement);
    public List<Evenement> getEvents();
    public String deleteEvent(int id);

    public Evenement getEventById(int id);
}
