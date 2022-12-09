public class Crayon extends Article{
    String couleur;

    public Crayon() {
    }

    public Crayon(int reference, String nom, String marque, double prixU, String couleur) {
        super(reference, nom, marque, prixU);
        this.couleur = couleur;
    }

    public String getDescriptif() {
        return "Crayon "+couleur+ " "+nom;
    }
}
