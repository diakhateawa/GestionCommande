package com.awa.service.console;

import com.awa.domaine.Article;
import com.awa.domaine.Client;
import com.awa.domaine.Commande;
import com.awa.repository.ArticleRepository;
import com.awa.repository.ClientRepository;
import com.awa.repository.CommandeRepository;
import com.awa.service.DisplayService;
import com.awa.service.MenuService;


import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final ClientRepository clientRepository;
    private final CommandeRepository commandeRepository;
    private final ArticleRepository articleRepository;

    public ScannerMenuService(DisplayService displayService, ClientRepository clientRepository, CommandeRepository commandeRepository, ArticleRepository articleRepository) {
        this.displayService = displayService;
        this.scanner = new Scanner(System.in);
        this.clientRepository = clientRepository;
        this.commandeRepository = commandeRepository;
        this.articleRepository = articleRepository;
    }


    private String lireChoix() {
        return scanner.next();
    }


    @Override
    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );

    }

    private void afficherMenu(String choix) {
        Client[] clients  = clientRepository.getAll();
        if ("1".equalsIgnoreCase(choix)) {
            System.out.println("entrer le numero du client");
            int noclt = scanner.nextInt();

            Client client = clientRepository.getById(noclt);
            Commande[] commandes = commandeRepository.getAllByClient(client);
            displayService.afficherCommandes(client, commandes);
            System.out.println("Entrer le numero de commande");
            int nocmd = scanner.nextInt();
            Commande[] commande = commandeRepository.findById(nocmd);

            Article[] articles = articleRepository.getAll();
            displayService.afficherArticle(articles);

            int noart = scanner.nextInt();
            Article article = articleRepository.getById(noart);
        }

        if ("2".equalsIgnoreCase(choix)) {
            int noclt = scanner.nextInt();

            Client client = clientRepository.getById(noclt);
            Commande[] commandes = commandeRepository.getAllByClient(client);
            displayService.afficherCommandes(client, commandes);

            int nocmd = scanner.nextInt();
            Commande[] commande = commandeRepository.findById(nocmd);

            Article[] articles = articleRepository.getAll();
            displayService.afficherArticle(articles);

            int noart = scanner.nextInt();
            Article article = articleRepository.getById(noart);
        }
    }
}
