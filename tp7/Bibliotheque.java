public class Bibliotheque {
    protected Document[] tabdoc;
    protected int nombre;
    public Bibliotheque(int capacité) {
        tabdoc= new Document[capacité];
        this.nombre=0;
    }

    Document document(int i){
        return tabdoc[i];
    }
    void afficherDocuments(){
        for (int i=0; i < this.nombre; i++) {
            if(this.tabdoc[i] instanceof Livre)
           System.out.println(this.tabdoc[i].getTitre()+"Num["+this.tabdoc[i].getNumEnreg()+"]"); 
        }
    }
    boolean ajouter(Document doc){   
            if(this.nombre++>tabdoc.length){
                return false;
            }else{
                this.tabdoc[nombre]=doc;
                this.nombre++;
                return true;
            }
    }
        boolean supprimer(Document doc){
	    	int indice=-1;
	    	for(int i=0;i<nombre;i++){
	    		if(tabdoc[i].getTitre()==doc.getTitre()  && tabdoc[i].getNumEnreg()==doc.getNumEnreg()){
	    			indice=i;
	    		}
	    	}
	    	if(indice!=-1)
	    	{
	    		for(int j=indice;j<nombre-1;j++){
	    			tabdoc[j]=tabdoc[j+1];
	    			
	    		}
	    	nombre--;
	    			return true;
	    		
	    	}
	    	return false;
	    }
            
    void afficherAuteurs(){
        for (int i=0; i < this.nombre; i++) {
          if(this.tabdoc[i] instanceof Livre){
            Livre l=(Livre)this.tabdoc[i];
            System.out.println("Auteur :"+l.getAuteur());
          } 
        }
    }
}