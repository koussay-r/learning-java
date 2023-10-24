public class Fonction_Math {
    public static long Factoriel(int x){
        if (x==0){
            return 1;
        }
        else{
            return x * Factoriel(x-1);
        }
    }
    public static int Somme(int n){
        int x=0;
        for(int i=0; i<n; i++){
            if((i+1)%2==0){
                x=x+i+1;
            }
        }
        return x;
    }
    public static double RacineCarré(int x){
        return Math.sqrt(x);
    }
}
