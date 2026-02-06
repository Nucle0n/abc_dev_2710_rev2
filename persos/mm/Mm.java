import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mm {

    public enum Verif
        {
            BIEN_PLACE("\033[38;2;0;255;0m"),
            MAL_PLACE("\033[38;2;255;255;0m"),
            ABSENT("\033[38;2;80;80;80m");

            private final String color;

            private Verif(String color)
            {
                this.color = color;
            }
            public String getColor()
            {
                return this.color;
            }
        }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        
        int     essais          = 0;
        int[]   combinaison     = new int[4],
                propositionTab  = new int[4];        
        Verif[] compareTab      = new Verif[4];

        combinaison = generationDeLaCombinaisonSecreteAQuatreChiffres();

        debug(combinaison);

        do 
        {
            propositionTab = propositionJ();
            compareTab = compare(combinaison, propositionTab);
            Mm.afficher(propositionTab, compareTab);
            essais++;
        }
        while (!gagne(combinaison, propositionTab));
        System.out.println("Score = "+essais);
        sc.close();


    }

    // Methodes
    public static int[] generationDeLaCombinaisonSecreteAQuatreChiffres()
    {
        Random  rng = new Random();
        int[]   combinaison = new int[4];

        for (int i = 0; i < combinaison.length; i++)
        {
            combinaison[i] = rng.nextInt(0, 10);
        }
        return combinaison;
    }
    /**
     * test
     * **/
    public static int[] propositionJ()
    {   
        
        Scanner sc = new Scanner(System.in);
        int[] ret_jTab = new int[4];

        System.out.print("Proposez une combinaison à 4 chiffres : ");
        // TRY CATCH
        String prop = sc.nextLine();

        for (int i = 0; i < ret_jTab.length; i++) {
            ret_jTab[i] = prop.charAt(i)-'0';
        }
        
        return ret_jTab;       
    }

    public static Verif[] compare(int[] _combinaison, int[] _propositionTab)
    {
        Verif[] compareTab = new Verif[4];

        for (int i = 0; i < 4; i++)
            {
                compareTab[i] = Verif.ABSENT; // remplissage de compareTab[] avec "ABSENT"
                for (int j = 0; j < compareTab.length; j++) {
                    if (_propositionTab[i] == _combinaison[j]){
                        compareTab[i] = Verif.MAL_PLACE;
                        break;
                    }
                }
                if (_combinaison[i] == _propositionTab[i])
                {
                    compareTab[i] = Verif.BIEN_PLACE;
                }
            }
        return compareTab;
    }

    public static boolean gagne(int[] _combinaison, int[] _propositionTab){
        for (int i = 0; i < 4; i++) {
            if (_combinaison[i] != _propositionTab[i])
            {
                return false;
            }            
        }
        return true;
    }

    public static void afficher(int[] _propositionTab, Verif[] _compareTab)
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.print(_compareTab[i].getColor() + _propositionTab[i] + " \033[m");
        }
        System.out.println();
    }

    /**
     * DEBUG affichage de la combinaison
     **/

    public static void debug(int[] _combinaison)
    {
    System.out.print("\n");
        
        System.out.print("\n\033[4;1mDebug :\033[m\n" + "Combinaison secrète :\t");
        for (int i = 0; i < 4; i++)
        {
            System.out.print(_combinaison[i]+" ");
        }

        System.out.print("\n");
    }

}
