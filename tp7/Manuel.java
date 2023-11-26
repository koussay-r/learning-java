public class Manuel extends Livre {
    private int niveau;
    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Manuel(int numEnreg, String titre, String auteur, int nbPages, int niveau) {
        super(auteur, titre, numEnreg, nbPages);
        this.niveau = niveau;
    }
}
