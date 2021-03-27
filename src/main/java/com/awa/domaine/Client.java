package com.awa.domaine;

public class Client {

    private int noclt;
    private String nom;
    private String prenom;
    private String adresse;

    public Client(int noclt, String nom, String prenom, String adresse) {
        this.noclt = noclt;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public int getNoclt() {
        return noclt;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNoclt(int noclt) {
        this.noclt = noclt;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
