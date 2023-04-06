package com.example.enicarevent.service;

import com.example.enicarevent.model.Utilisateur;
import com.example.enicarevent.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurSerice {
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll() ;
    }

    @Override
    public Utilisateur getutlisateurbyEmail(String email) {
        return utilisateurRepository.getUtilisateurByemail(email);
    }


}
