public class Revue extends Document {
    private int mois;
    private int annee;
    public void setMois(int mois) {
        this.mois = mois;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public int getMois() {
        return mois;
    }
    public int getAnnee() {
        return annee;
    }
    public Revue(int numEnreg, String titre, int mois, int annee) {
        super(numEnreg, titre);
        this.mois = mois;
        this.annee = annee;
    }

}
