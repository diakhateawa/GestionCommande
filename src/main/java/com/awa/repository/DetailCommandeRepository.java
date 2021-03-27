package com.awa.repository;


import com.awa.domaine.Article;
import com.awa.domaine.Commande;
import com.awa.domaine.DetailCommande;

public interface DetailCommandeRepository {
    DetailCommande[] getAllByAricle (Article article, Commande commande);
    DetailCommande findById(int nolc);
}