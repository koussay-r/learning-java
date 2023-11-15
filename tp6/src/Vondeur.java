public class Vondeur extends Salaire {
    private double Vente;
    private double Pourcentage;
    public Vondeur(int matricule, String nom, int recrutement, double Vente, double Pourcentage) {
        super(matricule, nom, recrutement);
        this.Vente=Vente;
        this.Pourcentage=Pourcentage;
    }
    public double getVente(double Vente) {
        return this.Vente = Vente;
    }
    public double getPourcentage(double Pourcentage) {
        return this.Pourcentage = Pourcentage;
    }
    public void setVente(double Vente){
        this.Vente=Vente;
    }
    public void setPourcentage(double Pourcentage){
        this.Pourcentage=Pourcentage;
    }
    public void affiche() {
        super.afficher();
        System.out.println("Vente: " + Vente + ", Pourcentage: " + Pourcentage);
    }
    public double salaire() {
        return super.salaire() + (Vente * Pourcentage);
    }
}
