public class Roman extends Livre {
    private double prixLitt;

    public double getPrixLitt() {
        return prixLitt;
    }

    public void setPrixLitt(double prixLitt) {
        this.prixLitt = prixLitt;
    }

    public Roman(int numEnreg, String titre, String auteur, int nbPages, double prixLitt) {
        super(auteur, titre, numEnreg, nbPages);
        this.prixLitt = prixLitt;
    }
}
