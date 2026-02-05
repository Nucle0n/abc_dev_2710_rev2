import java.util.Random;

public class Mm {
    public static void main(String[] args)
    {
        Random  rng = new Random();
        int[]   tab = new int[4];

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rng.nextInt(0, 10);
            System.out.print(tab[i]+" ");
        }

        System.out.print("\n");
    
    }
    
}
