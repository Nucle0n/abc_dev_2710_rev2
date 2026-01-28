
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class AppCompte {

    // public static final String FICHIER = "comptes.txt";

    public static void main(String[] args) {

        // Declare variables
        Scanner sc = new Scanner(System.in);
        int choix;
        boolean quit = false;

        ArrayList<Compte> listComptes =  new ArrayList<>();

        do {
                        System.out.println("------- MENU ------\n1 - Accès Comptes\n2 - Créer un compte\n3 - Quitter");
            choix = sc.nextInt();
                if (choix == 1){
                    AppCompte.compteCount(listComptes);
                    
                }
                if (choix == 2){
                    listComptes.add(creationCompte());
                    
                }
                if (choix == 3){
                    quit = true;
                }
                else{
                    System.out.println("Entrée invalide");
                }
        } while (!quit);
        
        // System.out.println("----------------\nCompte 1 : \n"+listComptes.get(0));


        // System.out.println(Compte1.getownerName()+" : "+Compte1.getid());
        sc.close();
    }

    public static Compte creationCompte(){
        Scanner sc = new Scanner(System.in);
        String ownerName;
        double solde,decouvert;
        long id;

        System.out.print("Nom du titulaire du compte : ");
        ownerName = sc.nextLine();
        id = Instant.now().toEpochMilli();
        
        System.out.print("Solde de départ : ");
        solde = sc.nextDouble();
        
        System.out.print("Decouvert autorisé : ");
        decouvert = sc.nextDouble();
        
        Compte compte = new Compte(ownerName, id, solde, decouvert);
        return compte;
        // return new Compte(ownerName, id, solde, decouvert);
        
    }
    
    public static void compteCount(ArrayList<Compte> _listComptes){

        System.out.println("\nliste de comptes :");
        for (int i = 0 ; i < _listComptes.size() ; i++){
            System.out.println((i+1)+" - "+_listComptes.get(i).getownerName());
        }
    }

}
