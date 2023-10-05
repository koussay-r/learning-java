public class Point{
    int x=5;
    public void afficher(){
        System.out.println(x);
    }
    public static void main(String[] args){
        Point p=new Point();
        System.out.println(p.x);
    }
}