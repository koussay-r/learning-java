public class Agence {
    private String libelle;
    public Compte[] tabComptes;
    public int nbComptes;
    public Agence(String I,int capacite) {
        this.tabComptes=new Compte[capacite];
        this.libelle = I;
        this.nbComptes=0;
    }
    public boolean ajouterCompte(Compte c){
        if(this.nbComptes<this.tabComptes.length){
            this.tabComptes[this.nbComptes]=c;
            this.nbComptes++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean fermerCompte(int code){
        int a=-1;
        for (int i = 0; i < this.nbComptes; i++) {
            if(this.tabComptes[i].getTiulaire().getCode()==code){
                this.nbComptes--;
                a=i;
            }
        }
        if(a==-1){
            return false;
        }
        else{
            for (int i = a; i < this.nbComptes-1; i++) {
                tabComptes[i]=tabComptes[i+1];
            }
            return true;
        }
    }
    public void aDecouvert(){
        for (int i = 0; i < tabComptes.length; i++) {
            if(((CompteCourant)this.tabComptes[i]).EstDecouvert()){
                this.tabComptes[i].afficherComptes();
            }
        }
    }
}
