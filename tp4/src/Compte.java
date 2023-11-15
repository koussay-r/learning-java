public class Compte {
    private int NumCompte;
    static int count=0;
    private double solde;
    private double decouvertMaximal;
    private double debitMaximal;
    Personne titulaire;
    public Compte(Personne titulaire) {
        count++;
        this.NumCompte=count;
        this.titulaire=titulaire;
        this.solde=0;
        this.decouvertMaximal=1000;
        this.debitMaximal=800;
       
    }
    public Compte(Personne titulaire,double decouvertMaximal,double debitMaximal) {
        this(titulaire);
        count++;
        this.NumCompte=count;
        this.decouvertMaximal=decouvertMaximal;
        this.debitMaximal=debitMaximal;
       
    }
    public String toString() {
        return ("NumCompte: "+this.NumCompte+" decouvert"+this.decouvertMaximal+" debitMaximal"+this.debitMaximal+" "+ this.titulaire);
    }
    public int getNumCompte(){
        return this.NumCompte;
    }
   
    public double getSolde(){
        return this.solde;
    }
    public double getDecouvertMaximal(){
        return this.decouvertMaximal;
    }
    public double getDebitMaximal(){
        return this.debitMaximal;
    }
    public void setNumCompte(int NumCompte){
         this.NumCompte=NumCompte;
    } 
    public void setSolde(double solde){
        this.solde=solde;
    }
    public void setDecouvertMaximal(double decouvertMaximal){
        this.decouvertMaximal=decouvertMaximal;
    }
    public void setDebitMaximal(double debitMaximal){
        this.debitMaximal=debitMaximal;
    }
    public void crediter(double montant){
            this.solde=solde+this.solde;
    }
    public boolean debiter(double montant){
        if (montant < this.debitMaximal && this.solde - montant <= this.decouvertMaximal) {
            this.solde -= montant;
            return true;
        }
        else{
            System.out.println("erreur montant");
            return false;
        }
    }
    public boolean estaDécouvert(){
        if(this.solde<0){
            return true;
        }
        else{
            return false;
        }
    }
    public double MontantDécouvert(){
        if(this.solde<0){
            return this.solde;
        }
        else{
            return 0;
        }
    }
    public void virement1(Compte Compte2, double montant) {
        if (this.debiter(montant)) {
            Compte2.crediter(montant);
            System.out.println("le montant a etait crediter avec success");
        }
        else{
            System.out.println("error");
        }
    }
    public static  void virement2(Compte Compte2,Compte Compte1, double montant) {
        if (Compte1.debiter(montant)) {
            Compte2.crediter(montant);
            System.out.println("le montant a etait crediter avec success");
        }
        else{
            System.out.println("error");
        }
    }
}
