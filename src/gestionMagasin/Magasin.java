package gestionMagasin;
import gestionProduit.Produit;

public class Magasin {
    private int id;
    private String adresse;
    private int capaciteMag = 50;
    private Produit[] produit ;
    private int totalProduit;

    public Magasin(){

    }
    public Magasin(int id, String adresse){
        this.id =id;
        this.adresse = adresse;
        this.totalProduit = 0;
        this.produit = new Produit[this.capaciteMag];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMag() {
        return capaciteMag;
    }

    public void setCapaciteMag(int capaciteMag) {
        this.capaciteMag = capaciteMag;
    }

    public int getTotalProduit() {
        return totalProduit;
    }

    public Produit[] getProduit() {
        return produit;
    }

    public void setProduit(Produit[] produit) {
        this.produit = produit;
    }

    public void ajouterProduit(Produit produit, int i){
        if(i>=0 && i<50){
            this.produit[i] = produit;
            this.totalProduit++;
        }else {
            System.out.println("La valeur i doit être [0,50]");
        }
    }


}
