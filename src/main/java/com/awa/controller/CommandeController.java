package com.awa.controller;

import com.awa.repository.ArticleRepository;
import com.awa.repository.ClientRepository;
import com.awa.repository.CommandeRepository;
import com.awa.repository.DetailCommandeRepository;
import com.awa.repository.jdbc.*;
import com.awa.service.MenuService;
import com.awa.service.DisplayService;
import com.awa.service.console.ConsoleDisplayService;
import com.awa.service.console.ScannerMenuService;

public class CommandeController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;
    Db db = new MysqlDb();


    public CommandeController(){
        DetailCommandeRepository detailCommandeRepository = new JdbcDetailCommandeRepository();
        Db db = new MysqlDb();
        ArticleRepository articleRepository = new JdbcArticleRepository(db);
        ClientRepository clientRepository = new JdbcClientRepository(db);
        CommandeRepository commandeRepository = new JdbcCommandeRepository();

        displayService = new ConsoleDisplayService(articleRepository);
        scannerMenuService = new ScannerMenuService(displayService, clientRepository, commandeRepository, articleRepository);
    }

    public void process(){
        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }

}
