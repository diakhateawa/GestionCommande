package com.awa.repository;

import com.awa.domaine.Client;
import com.awa.domaine.Commande;

public interface CommandeRepository {
    Commande[] getAllByClient(Client client);
    Commande[] findById(int nocmd);
}
