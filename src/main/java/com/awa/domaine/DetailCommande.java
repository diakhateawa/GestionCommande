package com.awa.domaine;

import java.util.Date;

public class DetailCommande {
    private int nolc;
    private Commande commande;
    private Article article;
    private int qte;

    public DetailCommande(int nolc, Commande commande, Article article, int qte) {
        this.nolc = nolc;
        this.commande = commande;
        this.article = article;
        this.qte = qte;
    }

    public int getNolc() {
        return nolc;
    }

    public void setNolc(int nolc) {
        this.nolc = nolc;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
