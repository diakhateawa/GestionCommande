package com.awa.service;

import com.awa.domaine.Article;
import com.awa.domaine.Client;
import com.awa.domaine.Commande;

public interface DisplayService {

        void afficherBienvenu();

        void afficherMenuPrincipal();

        void afficherArticle(Article[] articles);

        void afficherCommandes(Client client, Commande[] commandes);
        void faireCommandes(Client client, Commande[] commandes);

}




