public abstract class Compte implements Operation {
    private final int numero;
    private final Client tiulaire;
    private double solde;
    public static int nbComptes=0;
    public Compte() {
        nbComptes++;
        this.tiulaire=new Client();
        this.numero=nbComptes;
        this.solde=0;
    }
    public Compte(Client tiulaire, double solde) {
        nbComptes++;
        this.numero=nbComptes;
        this.tiulaire = tiulaire;
        this.solde = solde;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Client getTiulaire() {
        return tiulaire;
    }
    @Override
    public String toString() {
        return "Compte [Numero : "+this.numero+" Nom : "+this.tiulaire.getNom()+" solde : "+this.solde+"]";
    }
    public void afficherComptes(){
        this.toString();
    }
    public void deposer(double montant){
        this.solde=montant;
    }
}
