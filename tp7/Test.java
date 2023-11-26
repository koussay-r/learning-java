public class Test {
    public static void main(String[] args) {
        Bibliotheque Bibliotheque = new Bibliotheque(50); 
        Document unDocument = new Roman( 20,"game of thrones", "jj.martin",200,300);
        Bibliotheque.ajouter(new Document(1001, "Je n'ai plus d'idee"));
        Bibliotheque.ajouter(new Livre("Y. Rolognese ", "Nicolas Sarkozy,le manuel vaudou", 1002, 500));
        Bibliotheque.ajouter(unDocument);
        Bibliotheque.ajouter(new Manuel(200,"A. Metral-Boitel", "Vive le Java",1004, 2));
        Bibliotheque.ajouter(new Revue(4,"Science et Vie", 2008, 1005));
        Bibliotheque.ajouter(new Dictionnaire(1006,"Dictionnaire.FRANCAIS","Larousse"));
        System.out.println("--------------DOCUMENTS---------------------");
        Bibliotheque.afficherDocuments();
        System.out.println("-------------------------------------------");
        System.out.println("---------------AUTEURS----------------------");
        Bibliotheque.afficherAuteurs();
        System.out.println("----------------END-------------------------");
        System.out.println("-----DOCUMENTS SANS LE NUM 20-------------");
        Bibliotheque.supprimer(unDocument);
        Bibliotheque.afficherDocuments();
        System.out.println("----------------------END------------------");
    }
}
