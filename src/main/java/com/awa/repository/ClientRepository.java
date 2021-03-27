package com.awa.repository;

import com.awa.domaine.Client;

public interface ClientRepository {
    Client[] getAll();
    Client getById(int noclt);
}
