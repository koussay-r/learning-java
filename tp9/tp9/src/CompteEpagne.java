public class CompteEpagne extends Compte {
    private double taux;

    public CompteEpagne(Client tiulaire, double solde,double taux) {
        super(tiulaire, solde);
        this.taux = taux;
    }

    public CompteEpagne(double taux) {
        this.taux =taux;
    }
    public void calculInterets(){
       super.setSolde(super.getSolde()+super.getSolde()*this.taux); 
    }

    @Override
    public String toString() {
        return "CompteEpagne [taux : "+this.taux+"]";
    }
    public void retirer(double montant){
        if(super.getSolde()-montant>0){
            super.setSolde(super.getSolde()-montant);
        }
        else{
            System.out.println("erreur");
        }
    }
    
}
