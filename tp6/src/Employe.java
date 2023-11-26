public class Employe extends Salaire{
    private double Hsupp;
    private double PHsupp;
    public Employe(int matricule, String nom, int recrutement, double Hsupp, double PHsupp) {
        super(matricule, nom, recrutement);
        this.Hsupp = Hsupp;
        this.PHsupp = PHsupp;
    }
    public void afficher() {
        super.afficher();
        System.out.println("nombre d'heures supplémentaires: " + Hsupp + ",  prix par heure supplémentaire: " + PHsupp);
    }

    public double salaire() {
        return super.salaire() + (Hsupp * PHsupp);
    }
    public double getHsupp(double Hsupp) {
        return this.Hsupp = Hsupp;
    }
    public double getPHsupp(double PHsupp) {
        return this.PHsupp = PHsupp;
    }
    public void setHsupp(double Hsupp){
        this.Hsupp=Hsupp;
    }
    public void setPHsupp(double PHsupp){
        this.PHsupp=PHsupp;
    }
}
