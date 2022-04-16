import java.sql.SQLException;

public class bateau {
    
    public int idAff = 459629;
    public int idAffLot;
    public int idTran;
    public int lotpoids;
    public int tarifunit;



public static void main (String[] args) {

    Modele mod = new Modele();
    String req = "SELECT * FROM `affretement` WHERE 1";
    System.out.println(req);

    try{
        
        System.out.println(mod.getInfo(req));
    }
           catch(Exception e){
               System.out.println(e.getMessage()+ "Connection error");
           }
    
       }





}
