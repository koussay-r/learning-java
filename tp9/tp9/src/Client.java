import java.util.Scanner;
public class Client {
    private int code;
    private String nom;
    public Client(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }
    public int getCode() {
        return code;
    }
    public String getNom() {
        return nom;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "Code Client : "+this.code+" Nom Client : "+this.nom;
    }
    public void saisirClient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer Code");
        this.code = sc.nextInt();
        System.out.println(("entrer nom"));
        this.nom = sc.next();
        
    }
    public Client() {
        this.saisirClient();
    }
    public void afficherClient(){
        System.out.println(this);
    }
    
}
