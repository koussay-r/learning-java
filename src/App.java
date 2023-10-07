import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter your name");
        String varriable=Sc.nextLine();
        System.out.println("your name is "+varriable);
        Sc.close();
        Point p=new Point();
        p.afficher();
    }
}
