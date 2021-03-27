package com.awa.repository.jdbc;

import com.awa.domaine.Client;
import com.awa.repository.ClientRepository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcClientRepository implements ClientRepository {

    private final Db db;
    public JdbcClientRepository(Db db) {
        this.db = db;
    }
    public Client[] getAll(){
        try {
            ResultSet rs = db.getResultSet("SELECT * FROM client");
            List<Client> clients = new ArrayList<>();
            while (rs.next()) {
                int noclt = rs.getInt("noclt");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String adresse = rs.getString("adresse");
                Client client = new Client(noclt, nom,prenom, adresse);
                clients.add(client);
            }
            return clients.toArray(new Client[0]);
        }
        catch (Exception ex){
            return new Client[0];
        }
    }
    public Client getById(int noclt) {
        try {
            String query = "SELECT * FROM client where noclt = ? ";
            ResultSet resultSet = db.getResultSet(query, noclt);
            String nom = resultSet.getString("nom");
            String prenom = resultSet.getString("prenom");
            String adresse = resultSet.getString("adresse");
            return new Client(noclt, nom, prenom, adresse);
        }
        catch (Exception ex){
            return null;
        }
    }
}
