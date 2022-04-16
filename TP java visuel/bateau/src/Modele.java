

import java.sql.*;
import java.util.*;

import javax.swing.JComboBox;

import static java.lang.System.exit;

public class Modele {

    // methode pour se connecter a la base de donnée

    public Connection seConnecter(String url, String user, String password) throws SQLException {
        Connection conn = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur lors du chargement" + e.getMessage());
            exit(0);
        }
        return conn;
    }

    // Configuration de la requete sql de connection a la base de donnée

    public ResultSet traiterRequete(String req) throws SQLException {
        Statement stmt = null;
        Connection connexion = null;
        ResultSet result = null;

        try {
            String url = "jdbc:mysql://localhost:3306/dbfret";
            String user = "root";
            String password = "";
            connexion = this.seConnecter(url, user, password);
            stmt = (Statement) connexion.createStatement();
            result = stmt.executeQuery(req);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    // méthode pour aller chercher les informations demander dans la base de donnée via une requete sql près rédigé

    public int getInfo (String req) throws SQLException{
        Statement stmt = null;
        Connection connexion = null;
        int nombre=0;
        try{

            // identifiant de la bdd
            String url = "jdbc:mysql://localhost:3306/dbfret";
            String user = "root";
            String password = "";

            // Reception du resultat de la query 
            connexion = this.seConnecter(url, user, password);
            stmt = (Statement) connexion.createStatement();
            ResultSet result = stmt.executeQuery(req);

            // mise en forme du resulat 
            while (result.next()) {
                nombre = result.getInt(1);
            }
        }
        catch(SQLException e){
            System.out.println("Connection error");
        }
        // renvoie du resultat 
        return nombre;

    }
    

}