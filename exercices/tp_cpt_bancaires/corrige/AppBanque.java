package corrige;
import java.util.Scanner;

public class AppBanque
{
    public static void main(String[] args)
    {
        
        // Couleurs

        Scanner sc = new Scanner(System.in);
        int     numMan;
        
        String  YELLOW  = "\033[38;2;255;234;0m",
                LBLUE   = "\033[38;2;18;156;255m",
                LGREEN  = "\033[4;38;2;0;255;145m",
                ENDCOL  = "\033[m",

                BG      = "\033[48;2;35;130;94m";
        

        Banque b = new Banque("ABC Bank");
        b.Init();

        b.afficherComptes();

        b.ajouteCompte(new Compte("Dutronc", 4500, -500));

        System.out.println("\n--------------\n"+LGREEN+"Ajout du compte de Mr Dutronc :"+ENDCOL);
        b.afficherComptes();

        System.out.println("\n--------------\n"+LGREEN+"Compte avec le plus haut solde :\n"+ENDCOL);
        int[] maPosition = {0};
        System.out.println(b.compteSup(maPosition));
        System.out.println("la position du compte dans le tableau banque est : "+maPosition[0]);

        System.out.println(LGREEN+"\n---- Ajout du compte de Mr Cpt.Haddock ---"+ENDCOL);
        CompteEpargne Haddock = new CompteEpargne("Haddock", 22950.0, 0.0, 0.75);
        System.out.println(Haddock);

        double[] tab24 = new double[24];
        for (int i = 0; i < tab24.length; i++)
        {
            tab24[i] = 22950;
        }

        double interets = Haddock.calculInteretAnnuel(tab24);

        System.out.println("\033[1mIntérets annnuels : \033[m"+interets+"€");

        System.out.println("Test de transfert :");
        System.out.print("Transfert depuis le compte : ");
        int numCompteDebit = sc.nextInt();
        sc.nextLine();
        System.out.print("Vers le compte : ");
        int numCompteCredit = sc.nextInt();
        sc.nextLine();
        System.out.print("Montant à transférer : ");
        int montant = sc.nextInt();
        sc.nextLine();

        b.transferer(numCompteDebit, numCompteCredit, montant);
        b.compteParNum();
        b.compteParNum();

        sc.close();
    }
}
