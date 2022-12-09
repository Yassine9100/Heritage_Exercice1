public class Article {
    protected int reference;
    protected String nom;
    protected String marque;
    protected double prixU;

    public Article(){
    }

    public Article(int reference, String nom, String marque, double prixU) {
        this.reference = reference;
        this.nom = nom;
        this.marque = marque;
        this.prixU = prixU;
    }
    public String getDescriptif() {
        return "";
    }
}
