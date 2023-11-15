public class Salaire {
    private int Matricule;
    private String Nom;
    private double Recrutement;
    public Salaire(int Matricule,String Nom,double Recrutement){
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Recrutement = Recrutement;
    }
    public void setMatricule(int Matricule){
        this.Matricule = Matricule;
    }
    public void setNom(String Nom){
        this.Nom=Nom;
    }
    public void setRecrutement(double Recrutement){
        this.Recrutement = Recrutement;
    }
    public int getMatricule(){
        return this.Matricule;
    }
    public String getNom(){
        return this.Nom;
    }
    public double getRecrutement(){
        return this.Recrutement;
    }
    public void afficher(){
        System.out.println("Matricule: " + this.Matricule+"\n Nom: " + this.Nom+"\n Recrutement: " + this.Recrutement);
    }
    public double salaire() {
        if (this.Recrutement < 2005) {
            return 400.0;
        } else {
            return 280.0;
        }
    } 
    
}
