public class CompteCourant extends Compte {
    private double decouvertMax;
    public CompteCourant(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }
    public CompteCourant(Client titulaire,double solde,double decouvertMax) {
        super(titulaire,solde);
        this.decouvertMax = decouvertMax;}
    @Override
    public String toString() {
        return "CompteCourant [ titulaire=" + super.getTiulaire() + ", solde=" + super.getSolde()+"decouvert maximal="+this.decouvertMax+"]";
    }
    @Override
    public void deposer(double montant){
        super.setSolde(super.getSolde()-0.5);
        super.setSolde(montant);
    }
    public void setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }
    public void retirer(double montant){
        if(super.getSolde()-0.5-montant>-this.decouvertMax){
            super.setSolde(super.getSolde()-0.5);
            super.setSolde(super.getSolde()-montant);
        }
        else{
            System.out.println("erreur");
        }
    }
    public boolean EstDecouvert(){
        if(super.getSolde()>=0){
            return false;
        }
        else{
            return true;
        }
    }
    public void virement(Compte c,double montant){
        super.setSolde(super.getSolde()-0.5);
        if(super.getSolde()-0.5-montant>0){
            super.setSolde(super.getSolde()-montant);
            c.setSolde(c.getSolde()+montant);
        }
    }
    public double getDecouvertMax() {
        return decouvertMax;
    }
}
