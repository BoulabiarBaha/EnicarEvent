package com.example.enicarevent.service;

import com.example.enicarevent.model.Spectateurs;
import com.example.enicarevent.repository.SpectateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class SpectateursServiceImpl implements SpectateursService {
    @Autowired
    private SpectateursRepository spectateursRepository;
    @Override
    public Spectateurs saveSpectateur(Spectateurs spectateurs) {
        return spectateursRepository.save(spectateurs);
    }

    public List<Spectateurs> getSpectateursByIdevenement(int idevenement) {
        return spectateursRepository.getSpectateursByidevenement(idevenement);
    }
}
