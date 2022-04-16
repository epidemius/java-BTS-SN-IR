import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Heritage {

    
public static void main(String[] args) {

     Adresse adr1 = new Adresse("1","2","3","4");

     Personne pers1 = new Personne("Messager","Jeremy");

     Deposant depo1 = new Deposant("Castelo lopez","David","espagnol","David.castellolopez@gmail.fr"," 2 rue impasse du chaumage");

     Deposant depo2 = new Deposant("Castel","Henry","portugais","henry.castel@gmail.fr"," 1 rue impasse du chaumage");

     Architecte arch1 = new Architecte("sympathique ", "constructeur de maison", "Créteil", "3 rue de l'architecture", "12345678");


    List<Deposant> LesDeposant = new ArrayList<Deposant>();
    LesDeposant.add(depo1);
    LesDeposant.add(depo2);
    System.out.print(LesDeposant.get(0).getNom());

}

}
