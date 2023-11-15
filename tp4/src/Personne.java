public class Personne {
    private String nomTitulaire;
    private String prenomTitulaire;
    private String adresseTitulaire;
    public Personne(String nomTitulaire, String prenomTitulaire, String adresseTitulaire){
        this.nomTitulaire=nomTitulaire;
        this.prenomTitulaire=prenomTitulaire;
        this.adresseTitulaire=adresseTitulaire;
    }
    public String toString(){
        return ("Nom :"+this.nomTitulaire+" prenom :"+this.prenomTitulaire+" adresse :"+this.adresseTitulaire);
    }
    public String getNomTitulaire(){
        return this.nomTitulaire;
    }
    public String getPrenomTitulaire(){
        return this.prenomTitulaire;
    }
     public String getAdresseTitulaire(){
        return this.adresseTitulaire;
    }
    public void setNomTitulaire(String nomTitulaire){
        this.nomTitulaire=nomTitulaire;
   }
   public void setPrenomTitulaire(String prenomTitulaire){
       this.prenomTitulaire=prenomTitulaire;
   }
   public void setAdresseTitulaire(String prenomTitulaire){
       this.prenomTitulaire=prenomTitulaire;
   }
}
