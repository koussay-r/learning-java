public class Pointcol extends Point{
    private int R;
    private int V;
    private int B;
    public Pointcol(){
        this.R=0;
        this.V=0;
        this.B=0;
    }
    public Pointcol(int R,int V,int B){
        super();
        if((R<=250&&R>=0) && (V<=250&&V>=0)&&(B<=250&&B>=0)){
        this.R=R;
        this.V=V;
        this.B=B;}
    }
    public Pointcol(char nom,int abs , int cord, int R,int V,int B){
        super(nom,abs,cord);
        if((R<=250&&R>=0) && (V<=250&&V>=0)&&(B<=250&&B>=0)){
        this.R=R;
        this.V=V;
        this.B=B;}
    }
    public void setColeur(int R,int V,int B){
        if((R<=250&&R>=0) && (V<=250&&V>=0)&&(B<=250&&B>=0)){
        this.R=R;
        this.V=V;
        this.B=B;}
    }
    public void affcihePointColeur(){
        this.affiche();
        System.out.println("(R="+this.R+" ; V="+this.V+"; B="+this.B+")\n \n");
    }
}
