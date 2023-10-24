public class Mesure {
    int mesure;
    static int nbMesures=0;
    static int SomMesures=0;
    public Mesure(int x){
        if(x>=-100 && x<=100){
            nbMesures++;
            mesure = x;
            SomMesures=SomMesures+mesure;
        }
        else{
            nbMesures=0;
        }
    }
    public void affiche(){
        if(nbMesures==0){
            System.out.println("mesure hors intervalle");
        }
        else {
            System.out.println("La valeur de la mesure : "+mesure);
        }
    }
     public void afficherMoyenne(){
        if(nbMesures==0){
            System.out.println("zéro mesures'");
        }
        else{
            double moy=SomMesures/nbMesures;
            System.out.println("La moyenne des "+nbMesures +" mesures est :"+moy);
        }

    }
}
