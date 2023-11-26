public class Livre extends Document {
    private String auteur;
    private int nbPages;
    public String getAuteur() {
        return this.auteur;
    }
    public int getNbPages() {
        return this.nbPages;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
    public Livre(String auteur,String titre,int numEnreg, int nbPages) {
        super(numEnreg, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    
}
