public class TestCompte {
    public static void main(String[] args) {
        Personne p=new Personne("koussay", "rouissia", "tabarka");
        Compte compte1 = new Compte(p);
        Compte compte2 = new Compte(p,1000,800);

        System.out.println(compte1.toString());
        System.out.println(compte2.toString());

        compte1.crediter(500);
        System.out.println("Nouveau solde du compte 1 après crédit : " + compte1.getSolde() + " DT");

        boolean debitReussi = compte2.debiter(800);
        System.out.println("Débit de 800 DT sur le compte 2 : " + (debitReussi ? "Réussi" : "Échoué"));
        System.out.println("Nouveau solde du compte 2 : " + compte2.getSolde() + " DT");

        System.out.println("Le compte 1 est à découvert : " + compte1.estaDécouvert());
        System.out.println("Montant du découvert du compte 1 : " + compte1.MontantDécouvert() + " DT");

        Compte.virement2(compte2, compte1, 300);
        System.out.println("Nouveau solde du compte 1 après virement : " + compte1.getSolde() + " DT");
        System.out.println("Nouveau solde du compte 2 après virement : " + compte2.getSolde() + " DT");
    }
}
