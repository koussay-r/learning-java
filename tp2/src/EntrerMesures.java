public class EntrerMesures {
    public static void main(String[] args){
        Mesure m1=new Mesure(30000);
        m1.affiche();
        Mesure m2=new Mesure(300);
        m2.affiche();
        Mesure m3=new Mesure(0);
        m3.affiche();
        Mesure m4=new Mesure(10);
        m4.affiche();
        Mesure m5=new Mesure(20);
        m5.affiche();
        m5.afficherMoyenne();

    }
}
