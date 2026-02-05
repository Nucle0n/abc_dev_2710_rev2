import java.util.Random;
import java.util.Scanner;

public class Mm {
    public static void main(String[] args)
    {
        Scanner sc   = new Scanner(System.in);
        Random  rng  = new Random();
                
        int[]   tab  = new int[4],
                jTab = new int[4];

        String     prop;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rng.nextInt(0, 10);
        }

        System.out.print("\n");

        System.out.print("Proposez une combinaison à 4 chiffres : ");
        prop = sc.nextLine();

        for (int i = 0; i < jTab.length; i++) {
            jTab[i] = prop.charAt(i)-'0';
        }


        System.out.print("\n\033[4;1mDebug :\033[m\n" + "Combinaison secrète :\t");
        for (int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i]+" ");
        }
        System.out.print("\nProposition du joueur :\t");
        for (int i = 0; i < jTab.length; i++) {
            System.out.print(jTab[i]+" ");
        }
        System.out.print("\n");
        
        sc.close();
    }
}
