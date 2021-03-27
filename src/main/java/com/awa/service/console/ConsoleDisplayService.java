package com.awa.service.console;
import com.awa.domaine.Article;
import com.awa.domaine.Client;
import com.awa.domaine.Commande;
import com.awa.repository.ArticleRepository;
import com.awa.service.DisplayService;

import java.util.Date;

public class ConsoleDisplayService implements DisplayService {

    private final ArticleRepository articleRepository;

    public ConsoleDisplayService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme commande et livraison !");
    }

    @Override
    public void afficherMenuPrincipal() {
        System.out.println("> 1 Lister les commandes disponibles ");
        System.out.println("> 2 Faire une commande");
    }

    @Override
    public void afficherArticle(Article[] articles) {
        System.out.println("Les articles  : ");
        for (int i = 0; i < articles.length; i++) {
            Article article = articles[i];
            System.out.println(
                    String.format(
                            "> %s %s  %s %s",
                            article.getNoart(),
                            article.getLibelle(),
                            article.getPrix(),
                            article.getQte_stock()
                    )
            );
        }

    }

    @Override
    public void afficherCommandes(Client client, Commande[] commandes) {
        System.out.println(String.format("La liste des commandes %s :", client.getNom()));
        for (int i = 0; i < commandes.length; i++) {
            Commande commande = commandes[i];
            System.out.println(String.format("> %s %s ", commande.getNocmd(), commande.getDateCmd()));
        }
    }

    @Override
    public void faireCommandes(Client client, Commande[] commandes) {
        for (int i = 0; i < commandes.length; i++) {
            Commande commande = commandes[i];
            System.out.println(String.format("> %s %s ", commande.getNocmd(), commande.getDateCmd()));
        }


    }

    /*@Override
    public void addCommandes(Client client, Commande[] commandes) {
        for (int i = 0; i < commandes.length; i++) {
            if (commandes[i] == null) {
                commandes[i] = createNewCommandes(Client client, Commande[] commandes);
                i=commandes.length;
            }
        }
    }
*/
}