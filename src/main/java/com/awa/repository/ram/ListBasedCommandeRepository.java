package com.awa.repository.ram;

import com.awa.domaine.Client;
import com.awa.domaine.Commande;
import com.awa.repository.CommandeRepository;

import java.util.List;

public class ListBasedCommandeRepository implements CommandeRepository {
    private final List<Commande> commandes;

    public ListBasedCommandeRepository(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public Commande[] getAllByClient(Client client) {
       // commandes.add(new Commande(1, '2020-03-10', client));


        return commandes.toArray(new Commande[0]);
    }

    @Override
    public Commande[] findById(int nocmd) {
        return new Commande[0];
    }
}
