import gestionMagasin.Magasin;
import gestionProduit.Produit;

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


        //System.out.println("******* gestionProduit.Produit 1 *******");
        produit1.setId(237);
        produit1.setLibelle("Boissons gazeuses");
        produit1.setMarque("Planet");
        produit1.setPrix(500);
        produit1.setDateExpiration(sdf.format(date.getTime()));

        //produit1.afficher();
        //System.out.println("******* gestionProduit.Produit 1 avec la méthode ToString *******");
        //System.out.println(produit1);
        //System.out.println("******* gestionProduit.Produit 2 *******");
        produit2.setPrix(0.700);
        produit2.setMarque("Nido");
        //produit2.afficher();
        //System.out.println("******* gestionProduit.Produit 2 avec la méthode ToString *******");
        //System.out.println(produit2);
        //System.out.println("******* gestionProduit.Produit 3 *******");
        produit3.setPrix(350);
        produit3.setMarque("Dolait");
        //produit3.afficher();
        //System.out.println("******* gestionProduit.Produit 3 avec la méthode ToString *******");
        //System.out.println(produit3);
        //System.out.println("******* gestionProduit.Produit 4 *******");
        //produit4.afficher();
        //System.out.println("******* gestionProduit.Produit 4 avec la méthode ToString *******");
        //System.out.println(produit4);

        Magasin magasin = new Magasin(225, "TotalEnergie Nsimeyong");

        magasin.ajouterProduit(produit4,0);
        magasin.ajouterProduit(produit1,1);
        magasin.ajouterProduit(produit2,2);
        magasin.ajouterProduit(produit3,3);
        System.out.println("Total produit : " + magasin.getTotalProduit());

        for (int i = 0; i<magasin.getTotalProduit(); i++){
            System.out.println(magasin.getProduit()[i]);
        }


    }
}