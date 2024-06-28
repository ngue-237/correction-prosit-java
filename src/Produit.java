import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Produit {
    int id;
    String libelle;
    String marque;
    double prix;
    String dateExpiration;

    public Produit(){

    }

    public Produit(int id, String libelle){
        this.id = id;
        this.libelle = libelle;
    }
    public Produit(int id, String libelle, String marque, double prix, String dateExpiration){
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    public void afficher(){
        System.out.println("Identifiant : " + this.id);
        System.out.println("Libelle : " + this.libelle);
        System.out.println("Marque : " + this.marque);
        System.out.println("Prix : " + this.prix);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd ");
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
