package com.awa.domaine;

import java.util.Date;

public class Commande {
    private int nocmd;
    private Date dateCmd;
    private Client client;

    public Commande(int nocmd, Date dateCmd, Client client) {
        this.nocmd = nocmd;
        this.dateCmd = dateCmd;
        this.client = client;
    }



    public int getNocmd() {
        return nocmd;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public Client getClient() {
        return client;
    }

    public void setNocmd(int nocmd) {
        this.nocmd = nocmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
