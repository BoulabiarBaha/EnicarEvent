package com.example.enicarevent.model;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom")
    private String nom;
    private String Prenom;
    private String Classe;
    @Column(unique = true)
    private String email;
    private String Motdepasse;
    private String role;


    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String classe, String email, String motdepasse, String role) {
        this.nom = nom;
        Prenom = prenom;
        Classe = classe;
        this.email = email;
        Motdepasse = motdepasse;
        this.role = role;
    }

    public String getMotdepasse() {
        return Motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        Motdepasse = motdepasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getClasse() {
        return Classe;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", Nom='" + nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Classe='" + Classe + '\'' +
                ", Email='" + email + '\'' +
                ", Motdepasse='" + Motdepasse + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
