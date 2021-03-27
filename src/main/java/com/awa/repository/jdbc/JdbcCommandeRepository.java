package com.awa.repository.jdbc;

import com.awa.domaine.Client;
import com.awa.domaine.Commande;
import com.awa.repository.CommandeRepository;

public class JdbcCommandeRepository implements CommandeRepository  {
    public Commande[] getAllByClient(Client client) {
        return new Commande[0];
    }
    public Commande[] findById(int nocmd) {
        return null;
    }
}
