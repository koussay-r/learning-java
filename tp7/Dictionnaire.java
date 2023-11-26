public class Dictionnaire extends Document {
    private String Langue;

    public String getLangue() {
        return Langue;
    }

    public void setLangue(String langue) {
        Langue = langue;
    }
    public Dictionnaire(int numEnreg, String titre, String langue) {
        super(numEnreg, titre);
        Document.num++;
        Langue = langue;
    }
    
}
