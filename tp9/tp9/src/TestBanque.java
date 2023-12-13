public class TestBanque {
    public static void main(String[] args){
        Agence agence = new Agence("agence", 10);
        CompteCourant cc1 = new CompteCourant(200);
        cc1.deposer(500);
        cc1.retirer(600);
        agence.ajouterCompte(cc1);
        CompteCourant cc2 = new CompteCourant(1000);
        cc2.deposer(300);
        agence.ajouterCompte(cc2);
        CompteCourant cc3 = new CompteCourant(500);
        cc2.virement(cc3, 1000);
        cc3.retirer(1500);
        agence.ajouterCompte(cc3);
        agence.fermerCompte(cc1.getTiulaire().getCode());
    }
}
