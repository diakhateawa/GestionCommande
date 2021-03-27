package com.awa.repository.ram;


import com.awa.domaine.Client;
import com.awa.repository.ClientRepository;

public class ArrayBasedClientRepository implements ClientRepository {

    public static final Client[] CLIENTS = {
            new Client(1, "Diakhate", "Awa", "Pikine"),
            new Client(2, "Diakhate", "Adama", "Pikine"),
            new Client(3, "Dia", "Aissatou", "Guediawaye"),
            new Client(4, "Ba", "Aminata", "Thies"),
            new Client(5, "Diakhate", "Awa", "Yoff"),

    };

    public Client[] getAll(){
        return CLIENTS;
    }

    public Client getById(int noclt){
        Client client ;
        for (int i = 0; i < CLIENTS.length; i++) {
            if(noclt == CLIENTS[i].getNoclt()){
                return CLIENTS[i];
            }
        }
        return null;
    }
}
