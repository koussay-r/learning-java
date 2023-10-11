public class Test {
    public static void main(String[] args){
        Point p1=new Point(3,5);
        Point p2=new Point();
        Point p3=new Point(p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
       System.out.println(p1.coïncide_V1(p2));
       System.out.println(Point.coïncide_V1(p1,p2));
    }
}
