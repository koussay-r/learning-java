public class Cercle {
    Point centre;
    int rayon;
    
    public Cercle(Point p,int a){
        this.centre=p;
        this.rayon=a;
    }
    public String toString(){
        return ("centre: "+centre+"et rayon :"+rayon);
    }
    public void translater(int a,int b){
        centre.abs=a;
        centre.cord=b;
    }
    public boolean equals(Object o){
        Cercle cer=(Cercle)o;
        return(cer.centre==this.centre);
    }
    public boolean contains(Point p){
        return(Math.sqrt(Math.pow(p.abs - centre.abs, 2) + Math.pow(p.cord - centre.cord, 2))<rayon);
    }

}
