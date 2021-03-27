package com.awa.repository.jdbc;

import com.awa.domaine.Article;
import com.awa.domaine.Commande;
import com.awa.domaine.DetailCommande;
import com.awa.repository.DetailCommandeRepository;

public class JdbcDetailCommandeRepository implements DetailCommandeRepository {
    @Override
    public DetailCommande[] getAllByAricle(Article article, Commande commande) {


        return new DetailCommande[0];
    }

    @Override
    public DetailCommande findById(int nolc) {
        return null;
    }
}
