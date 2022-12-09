public class Ramette extends Article{
    int grammage;

    public Ramette(int grammage) {
        this.grammage = grammage;
    }

    public Ramette(int reference, String nom, String marque, double prixU, int grammage) {
        super(reference, nom, marque, prixU);
        this.grammage = grammage;
    }

    public String getDescriptif() {
        return "Ramette "+nom+" "+grammage+"g/m2";
    }

}
