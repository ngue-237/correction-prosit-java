import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd ");
        Calendar date = new GregorianCalendar(2024,0,28);

        Produit produit1 = new Produit();
        Produit produit2 = new Produit(1021, "Lait et délice");
        Produit produit3 = new Produit(1021, "Yaourt et vitalait");
        Produit produit4 = new Produit(1021, "Yaourt et vitalait", "Sicam", 1200, sdf.format(date.getTime()));


        System.out.println("******* Produit 1 *******");
        produit1.id = 237;
        produit1.libelle = "Boissons gazeuses";
        produit1.marque = "Planet";
        produit1.prix = 500;
        produit1.dateExpiration = sdf.format(date.getTime());
        System.out.println();
        produit1.afficher();
        System.out.println("******* Produit 1 avec la méthode ToString *******");
        System.out.println(produit1);
        System.out.println("******* Produit 2 *******");
        produit2.prix = 0.700;
        produit2.marque = "Nido";
        produit2.afficher();
        System.out.println("******* Produit 2 avec la méthode ToString *******");
        System.out.println(produit2);
        System.out.println("******* Produit 3 *******");
        produit3.prix = 350;
        produit3.marque = "Dolait";
        produit3.afficher();
        System.out.println("******* Produit 3 avec la méthode ToString *******");
        System.out.println(produit3);
        System.out.println("******* Produit 4 *******");
        produit4.afficher();
        System.out.println("******* Produit 4 avec la méthode ToString *******");
        System.out.println(produit4);



    }
}