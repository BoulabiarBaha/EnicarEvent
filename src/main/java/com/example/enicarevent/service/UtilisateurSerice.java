package com.example.enicarevent.service;

import com.example.enicarevent.model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurSerice {
    public Utilisateur saveUtilisateur(Utilisateur utilisateur);
    public List<Utilisateur> getUtilisateurs();
    public  Utilisateur getutlisateurbyEmail(String email);
    public void updatemotdepasse(String email,String newpassword);
    public String supprimer (int id);








}
