package com.awa;

import com.awa.controller.CommandeController;
import com.awa.domaine.Article;

public class Main {
    public static void main(String[] args) {
        CommandeController commandeController = new CommandeController();
        commandeController.process();
    }
}
