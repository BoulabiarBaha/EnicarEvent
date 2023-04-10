package com.example.enicarevent.model;

import jakarta.persistence.*;

@Entity
public class Spectateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSpectateurs;

    @Column(name="idevenement")
    private int idevenement;
    private int idUtlisateur;
    private String nomSpectateur;
    private String prenomSpectateur;
    private String emailSpectateur;

    public Spectateurs() {
    }

    public Spectateurs(int idevenement, int idUtlisateur, String nomSpectateur, String prenomSpectateur, String emailSpectateur) {
        this.idevenement = idevenement;
        this.idUtlisateur = idUtlisateur;
        this.nomSpectateur = nomSpectateur;
        this.prenomSpectateur = prenomSpectateur;
        this.emailSpectateur = emailSpectateur;
    }

    public int getIdSpectateurs() {
        return idSpectateurs;
    }

    public void setIdSpectateurs(int idSpectateurs) {
        this.idSpectateurs = idSpectateurs;
    }

    public int getIdevenement() {
        return idevenement;
    }

    public void setIdevenement(int idevenement) {
        this.idevenement = idevenement;
    }

    public int getIdUtlisateur() {
        return idUtlisateur;
    }

    public void setIdUtlisateur(int idUtlisateur) {
        this.idUtlisateur = idUtlisateur;
    }

    public String getNomSpectateur() {
        return nomSpectateur;
    }

    public void setNomSpectateur(String nomSpectateur) {
        this.nomSpectateur = nomSpectateur;
    }

    public String getPrenomSpectateur() {
        return prenomSpectateur;
    }

    public void setPrenomSpectateur(String prenomSpectateur) {
        this.prenomSpectateur = prenomSpectateur;
    }

    public String getEmailSpectateur() {
        return emailSpectateur;
    }

    public void setEmailSpectateur(String emailSpectateur) {
        this.emailSpectateur = emailSpectateur;
    }

    @Override
    public String toString() {
        return "Spectateurs{" +
                "idSpectateurs=" + idSpectateurs +
                ", idevenement=" + idevenement +
                ", idUtlisateur=" + idUtlisateur +
                ", nomSpectateur='" + nomSpectateur + '\'' +
                ", prenomSpectateur='" + prenomSpectateur + '\'' +
                ", emailSpectateur='" + emailSpectateur + '\'' +
                '}';
    }
}
