package com.example.enicarevent.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private String date;
    private int nbrPlace;
    private String pathImage;
    private String nomClub;


    public Evenement(int id, String titre, String description, String date, int nbrPlace, String pathImage, String nomClub) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.nbrPlace = nbrPlace;
        this.pathImage = pathImage;
        this.nomClub = nomClub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getNomClub() {
        return nomClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public Evenement() {
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", nbrPlace=" + nbrPlace +
                ", pathImage='" + pathImage + '\'' +
                ", nomClub='" + nomClub + '\'' +
                '}';
    }
}
