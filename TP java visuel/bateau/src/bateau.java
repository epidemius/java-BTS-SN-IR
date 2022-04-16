import java.sql.SQLException;
import java.util.Scanner;

public class bateau {
    




public static void main (String[] args) { 

    // définition de toute les variable

    int idAff = 459629;
    int idAffChoisi;
     int idAffLot = 0;
     int idTran;
     int lotpoids = 0;
     int tarifunit = 0;
     int resultTot;
     int idBatNoMars = 0;


     // définition des requetes SQL

    Modele mod = new Modele();
    String req2 = "SELECT `idTran` FROM `lot` WHERE `idAff`= 459629";
    String req3 = "SELECT `poids` FROM `lot` WHERE `idAff`= 459629";
    String req4 = "SELECT `idLot` FROM `lot` WHERE `idAff`= 459629";


    try{
        //envoie des querys

        idTran = mod.getInfo(req2);
        lotpoids = mod.getInfo(req3);
        idAffLot = mod.getInfo(req4);

    }
           catch(Exception e){
               System.out.println(e.getMessage()+ "Connection error");
           }



    String req5 = "SELECT `tarifunit` FROM `tranche` WHERE `id`= "+ idAffLot +"";
    try{
        //envoie des querys
        tarifunit = mod.getInfo(req5);

    }
           catch(Exception e){
               System.out.println(e.getMessage()+ "Connection error");
           }

    // calcul du resultat final        

    resultTot = lotpoids * tarifunit;

    // impression de la réponse
    System.out.println("le chiffre d'affaires de l'affrètement n°459629 est de = "+ resultTot +"");

    String req6 ="SELECT `idBatFret` FROM `affretement` WHERE `date` != 'mars'";
    try{
        //envoie des querys
        idBatNoMars = mod.getInfo(req6);

    }
           catch(Exception e){
               System.out.println(e.getMessage()+ "Connection error");
           }
           // affichage du résultat
     System.out.println("l'idée du bateau qui ne pars pas en mars est le bateau = "+ idBatNoMars +"");
           // affichage des id disponble
     System.out.println("Les bateau enregistré sont les bateaux 2, 3 et 459629.");
     System.out.println("Veuillez selectionner l'id d'un bateau pour obtenir le prix:");
           // recuperation de l'idée entré
     Scanner sc = new Scanner(System.in);
     int val = sc.nextInt();
     if ( val !=2 && val !=3 && val !=459629 ){
         System.out.println(" cette id de bateau n'existe pas ");
     }
     else{
        System.out.println("champion cet ID existe");
    
     // définition des requetes SQL
    String req7 = "SELECT `idTran` FROM `lot` WHERE `idAff`= "+ val +"";
    String req8 = "SELECT `poids` FROM `lot` WHERE `idAff`=  "+ val +"";
    String req9 = "SELECT `idLot` FROM `lot` WHERE `idAff`= "+ val +"";


    try{
        //envoie des querys

        idTran = mod.getInfo(req7);
        lotpoids = mod.getInfo(req8);
        idAffLot = mod.getInfo(req9);

    }
           catch(Exception e){
               System.out.println(e.getMessage()+ "Connection error");
           }



    String req10 = "SELECT `tarifunit` FROM `tranche` WHERE `id`= "+ idAffLot +"";
    try{
        //envoie des querys
        tarifunit = mod.getInfo(req10);

    }
           catch(Exception e){
               System.out.println(e.getMessage()+ "Connection error");
           }

    // calcul du resultat final        

    resultTot = lotpoids * tarifunit;

    // impression de la réponse
    System.out.println("le chiffre d'affaires de l'affrètement n°459629 est de = "+ resultTot +"");
}
       }


// The end

}
