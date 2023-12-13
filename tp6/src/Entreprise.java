public class Entreprise {
    public static void main(String[] args){
                Salaire[] tabSalarie = new Salaire[5];
                tabSalarie[0]=new Employe(12345,"Walid",2002,15,4);
                tabSalarie[1]=new Vendeur(23445,"Yessine",2007,1000,0.1);
                tabSalarie[2]=new Vendeur(65478,"Nassime",2000,700,0.1);
                tabSalarie[3]=new Employe(87698,"Aymen ",2003,19,5);
                tabSalarie[4]=new Employe(12345,"Khaled",2008,7,4);
                System.out.println("******************************** Liste des Employés*****************************");
                for (int i=0; i<5; i++){
                    if(tabSalarie[i] instanceof Employe){
                        tabSalarie[i].afficher();
                    }
                }
                System.out.println("*****************************************************************************");
                
                System.out.println("\n********************************** Liste des Vendeurs ***************************");
                for (int j=0; j<5; j++){
                    if(tabSalarie[j] instanceof Vendeur){
                        tabSalarie[j].afficher();
                    }
                }
                System.out.println("*****************************************************************************");
                System.out.println("\n******************* Nom du salarié le plus ancien dans l'entreprise ********************");
              //  double min=tabSalarie[0].getRecrutement();
               // String nom=tabSalarie[0].getNom();
               Salaire ancien=tabSalarie[0];
                for(int b=1;b<5;b++){
                    if(tabSalarie[b].getRecrutement()<ancien.getRecrutement()){
                        ancien=tabSalarie[b];
                
                    }
                }
                
                System.out.println("                           Nom: "+ancien.getNom()+" recruté en l'an "+ancien.getRecrutement());
                System.out.println("*****************************************************************************");

                System.out.println("\n****************** Matricule du vendeur disposant du plus grand salaire ****************");
                double max=0; 
                int matricule=0;
                for(int f=0;f<5;f++){
                    if(tabSalarie[f].salaire()>max&&tabSalarie[f] instanceof Vendeur){
                        max=tabSalarie[f].salaire();
                        matricule=tabSalarie[f].getMatricule();
                    }
                }
                System.out.println("                           Matricule="+matricule+" de salaire= "+max+" Dt");
                System.out.println("*****************************************************************************");

            }

    @Override
    public String toString() {
        return "Entreprise []";
    }
        }
        