package com.example.enicarevent.controller;

import com.example.enicarevent.model.Utilisateur;
import com.example.enicarevent.service.UtilisateurSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin
public class UtilisateurController {
    @Autowired
    private UtilisateurSerice utilisateurSerice;


    @PostMapping("/add")
    public String add(@RequestBody Utilisateur utilisateur) {
        utilisateurSerice.saveUtilisateur(utilisateur);
        return "new Utilisateur added";
    }


    @GetMapping("/getall")
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurSerice.getUtilisateurs();
    }

    @GetMapping("/{email}")
    public Utilisateur getutlisateurbyEmail(@PathVariable String email) {
        Utilisateur utilisateur = utilisateurSerice.getutlisateurbyEmail(email);
        return utilisateur;
    }

    @PostMapping("/{email}/{password}")
    public String updatePassword(@PathVariable String email,@PathVariable String password) {
        utilisateurSerice.updatemotdepasse(email, password);
        return "utlisateur a jour";
    }

    @DeleteMapping("/delete/{id}")
    public String supprimerUtlisateur (@PathVariable int id)
    {
        return utilisateurSerice.supprimer(id);
    }




}


