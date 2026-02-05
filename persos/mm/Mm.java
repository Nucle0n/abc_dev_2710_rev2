import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mm {

    public enum Verif
        {
            BIEN_PLACE(VERT),
            MAL_PLACE(JAUNE),
            ABSENT(GRIS);

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
        Scanner sc   = new Scanner(System.in);
        Random  rng  = new Random();
                
        int[]   tab  = new int[4],
                jTab = new int[4];

        String  JAUNE   = "\033[38;2;255;255;0m",
                VERT    = "\033[38;2;0;255;0m",
                GRIS    = "\033[38;2;50;50;50m",
                ENDCOL  = "\033[m";

        

        // boolean[] compareTab = new boolean[4];
        // boolean[] compareTab = {false,false,false,false};

        Verif[] compareTab = new Verif[4];

        String     prop;

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rng.nextInt(0, 10);
        }

        System.out.print("\n");
        
        System.out.print("\n\033[4;1mDebug :\033[m\n" + "Combinaison secrète :\t");
        for (int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i]+" ");
        }

        System.out.print("\n");

        System.out.print("Proposez une combinaison à 4 chiffres : ");
        prop = sc.nextLine();

        for (int i = 0; i < jTab.length; i++) {
            jTab[i] = prop.charAt(i)-'0';
        }


        for (int i = 0; i < compareTab.length; i++) {
            compareTab[i]=Verif.ABSENT;
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < compareTab.length; j++) {
                if (jTab[i] == tab[j]){
                    compareTab[i] = Verif.MAL_PLACE;
                    break;
                }
            }
            if (tab[i] == jTab[i])
            {
                compareTab[i] = Verif.BIEN_PLACE;
            }
        }


        

        
        System.out.print("\nProposition du joueur :\t");
        for (int i = 0; i < jTab.length; i++) {
            System.out.print(jTab[i]+" ");
        }
        System.out.print("\n");
        
        Mm.afficher(jTab, compareTab);


        
        sc.close();
    }
    public static void afficher(int[] _jTab, Verif[] _compareTab)
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.print(_compareTab[i].getColor() + _jTab[i] + " ");
        }
    }
}
