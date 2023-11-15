public class Point {
    char name;
    int abs;
    int cord;
    static int test=5;
    public Point(char name ,int abs,int cord){
        this.name=name;
        this.abs=abs;
        this.cord=cord;
    }
    public Point(){
        this.name='O';
        this.abs=0;
        this.cord=0;
    }
    public Point(Point p){
        this.name=p.name;
        this.abs=p.abs;
        this.cord=p.cord;
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
    public static boolean coïncide_V2(Point b,Point p){
        return (b.abs==p.abs&&b.cord==p.cord);
    }
    public boolean equals(Object o){
       Point d=(Point)o;
       return (this.abs==d.abs&&this.cord==d.cord);
   }
  }
