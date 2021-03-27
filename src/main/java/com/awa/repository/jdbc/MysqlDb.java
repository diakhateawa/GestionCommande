package com.awa.repository.jdbc;

import java.sql.*;
public class MysqlDb implements Db {
    public static final String NOM_BASE = "db_gestioncommandejdbc";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    private Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // chargement de la classe par son nom
        Class c = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver pilote = (Driver) c.newInstance();
        // enregistrement du pilote auprès du DriverManager
        DriverManager.registerDriver(pilote);
        // Protocole de connexion
        String protocole = "jdbc:mysql:";
        // Adresse IP de l’hôte de la base et port
        String ip = "localhost";  // dépend du contexte
        String port = "3306";  // port MySQL par défaut
        // Nom de la base ;
        String nomBase = NOM_BASE;  // dépend du contexte
        // Chaîne de connexion
        String conString = protocole + "//" + ip + ":" + port + "/" + nomBase;
        // Identifiants de connexion et mot de passe
        String dbUser = DB_USER;  // dépend du contexte
        String dbPassword = DB_PASSWORD;  // dépend du contexte
        // Connexion
        return DriverManager.getConnection(conString, dbUser, dbPassword);
    }

    @Override
    public ResultSet getResultSet(String query) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //connexion à la base de données
        Connection con = getConnection();
        //mapping relationnal db to objects
        Statement smt = con.createStatement() ;

        return smt.executeQuery(query);
    }

    @Override
    public ResultSet getResultSet(String query, int id) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Connection con = getConnection();
        PreparedStatement statement = con.prepareStatement(query);
        statement.setInt(1, id);
        return statement.executeQuery();
    }
}
