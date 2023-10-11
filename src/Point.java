public class Point {
    char name;
    int abs;
    int cord;
    public Point(int abs,int cord){
        this.abs=abs;
        this.cord=cord;
    }
    public Point(){
        this.name='O';
        this.abs=0;
        this.cord=0;
    }
    public Point(Point o){
        o.name='D';
        o.abs=5;
        o.cord=4;
    }
    public void affiche(){
        System.out.println(name+"("+abs+","+cord+")");
    }
    public void deplacer(int a,int b){
        cord=cord+b;
        abs=abs+a;
    }
    public void reset(){
        cord=0;
        abs=0;
    }
    public String toString(){
            return(name+"("+abs+","+cord+")");
    }
    public boolean coïncide_V1(Point p){
        return (this.abs==p.abs&&this.cord==p.cord);
    }
    public static boolean coïncide_V1(Point b,Point p){
        return (b.abs==p.abs&&b.cord==p.cord);
    }
  }
