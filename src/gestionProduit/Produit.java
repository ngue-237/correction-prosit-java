package gestionProduit;

import java.text.SimpleDateFormat;


public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private String dateExpiration;

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
        return "gestionProduit.Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = 0;
        if(prix>0){
            this.prix = prix;
        }
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
