package com.awa.domaine;

public class Article {
    private int noart;
    private String libelle;
    private int prix;
    private int qte_stock;

    public Article(int noart, String libelle, int prix, int qte_stock) {
        this.noart = noart;
        this.libelle = libelle;
        this.prix = prix;
        this.qte_stock = qte_stock;
    }


    public int getNoart() {
        return noart;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getPrix() {
        return prix;
    }

    public int getQte_stock() {
        return qte_stock;
    }

    public void setNoart(int noart) {
        this.noart = noart;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setQte_stock(int qte_stock) {
        this.qte_stock = qte_stock;
    }
}
