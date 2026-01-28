
import java.time.Instant;
import java.util.Scanner;

public class AppCompte {

    // public static final String FICHIER = "comptes.txt";

    public static void main(String[] args) {

        // Declare variables
        Scanner sc = new Scanner(System.in);

        String ownerName;
        double solde,decouvert;
        long id;

        // compte 1
        System.out.println("Création du premier compte");

        System.out.print("Nom du titulaire du compte : ");
        ownerName = sc.nextLine();
        id = Instant.now().toEpochMilli();
        
        System.out.print("Solde de départ : ");
        solde = sc.nextDouble();
        
        System.out.print("Decouvert autorisé : ");
        decouvert = sc.nextDouble();
        
        Compte Compte1 = new Compte(ownerName, id, solde, decouvert);
        
        System.out.print("\n\033[1;4mDétails du compte 1 :\033[0m\n\n");
        System.out.println("Titulaire : "+ownerName+"\nNumero de compte : "+id+"\nSolde : "+solde+"\nAutorisation de découvert : "+decouvert+"\n");

        //compte 2
        System.out.println("Création du second compte");
        
        System.out.print("Nom du titulaire du compte : ");
        ownerName = sc.nextLine();
        id = Instant.now().toEpochMilli();
        
        System.out.print("Solde de départ : ");
        solde = sc.nextDouble();
        
        System.out.print("Decouvert autorisé : ");
        decouvert = sc.nextDouble();
        
        Compte Compte2 = new Compte(ownerName, id, solde, decouvert);
        
        System.out.print("\n\033[1;4mDétails du compte 2 :\033[0m\n\n");
        System.out.println("Titulaire : "+ownerName+"\nNumero de compte : "+id+"\nSolde : "+solde+"\nAutorisation de découvert : "+decouvert+"\n");
        
        // String nom, prenom;

        // int year,
        //     dept;

        // final int   BKCODE = 30004,
        //             AGCODE = 155;

        // long id;

        // long timestamp = Instant.now().toEpochMilli();
        
        // String menu1;

        // boolean haveAka = false;


        // // Begin user interactions

        // System.out.print("Possèdez vous un compte ?\n1 - \033[1;4mO\033[0mui\n2 - \033[1;4mN\033[0mon\n");
        // while (true) {
        // menu1 = sc.nextLine().toLowerCase().trim();
        //     if (menu1.equalsIgnoreCase("2") || menu1.equalsIgnoreCase("n"))
        //     {
        //         haveAka = false;
        //         System.out.println("Voulez vous en créer un ?");
        //         menu1 = sc.nextLine().toLowerCase().trim();
        //         if (menu1.equalsIgnoreCase("o") || menu1.equalsIgnoreCase("1")){
                    
        //             System.out.print("Entrez votre Nom : ");
        //             nom = sc.nextLine();

        //             System.out.print("Entrez votre prénom : ");
        //             prenom = sc.nextLine();

        //             System.out.print("Renseignez votre année de naissance (YYYY) : ");
        //             year = sc.nextInt();

        //             System.out.print("Numéro de votre département de naissance (xx) : ");
        //             dept = sc.nextInt();
                    
        //             id = Instant.now().toEpochMilli();

        //             System.out.println("Nouveau compte créé :\nMr " + nom + " " + prenom + "\nNuméro de compte : " + BKCODE +"-"+ AGCODE+"-" + dept + year + id);


        //         }
        //         else 
        //             break;

        //     }
        // }
        // System.out.println(timestamp);

        sc.close();
    }

    
}
