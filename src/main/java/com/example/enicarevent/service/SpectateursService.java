package com.example.enicarevent.service;

import com.example.enicarevent.model.Spectateurs;

import java.util.List;

public interface SpectateursService {
    public Spectateurs saveSpectateur (Spectateurs spectateurs);
    public List<Spectateurs> getSpectateursByIdevenement(int idevenement);
}
