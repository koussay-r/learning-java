public class Document {
    private int numEnreg;
    private String titre;
    static public int num=0;
    public int getNumEnreg() {
        return numEnreg;
    }
    public String getTitre() {
        return titre;
    }
    public void setNumEnreg(int numEnreg) {
        this.numEnreg = numEnreg;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Document(int numEnreg, String titre) {
        Document.num++;
        this.numEnreg = numEnreg;
        this.titre = titre;
    }
     
}