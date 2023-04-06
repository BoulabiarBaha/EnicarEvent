package com.example.enicarevent.service;

import com.example.enicarevent.model.Evenement;
import com.example.enicarevent.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceIml implements EventService{
    private final EventRepository eventrepository;

    public EventServiceIml(EventRepository eventrepository) {
        this.eventrepository = eventrepository;
    }

    @Override
    public Evenement saveEvenement(Evenement evenement) {
        return eventrepository.save(evenement);
    }

    @Override
    public List<Evenement> getEvents() {
        return eventrepository.findAll();
    }
}
