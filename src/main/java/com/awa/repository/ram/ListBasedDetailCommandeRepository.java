package com.awa.repository.ram;


import com.awa.domaine.Article;
import com.awa.domaine.Commande;
import com.awa.domaine.DetailCommande;
import com.awa.repository.DetailCommandeRepository;

import java.util.List;

public class ListBasedDetailCommandeRepository implements DetailCommandeRepository {
    private final List<DetailCommande> detailCommandes;

    public ListBasedDetailCommandeRepository(List<DetailCommande> detailCommandes) {
        this.detailCommandes = detailCommandes;
    }


    @Override
    public DetailCommande[] getAllByAricle(Article article, Commande commande) {
        detailCommandes.add(new DetailCommande(1, commande, article, 2));
        detailCommandes.add(new DetailCommande(2, commande, article, 4));
        detailCommandes.add(new DetailCommande(3, commande, article, 8));
        detailCommandes.add(new DetailCommande(4, commande, article, 2));
        return detailCommandes.toArray(new DetailCommande[0]);
    }

    @Override
    public DetailCommande findById(int nolc) {
        return null;
    }


}
