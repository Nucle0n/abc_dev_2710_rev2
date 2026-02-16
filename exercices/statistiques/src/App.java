import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        
        ArrayList<Double> salaires = new ArrayList<Double>();

        salaires.add(2100.0);

        for (int i = 1; i < 15; i++) 
        {
            salaires.add(salaires.get(i-1) + 50);
        }

        double[] tmp = {2900, 2950, 2950, 3000, 3000, 3000, 3000,3100, 3100, 3150, 3150, 3200, 3200, 3250, 3250, 3300, 3300, 3350, 3350, 3400, 3400, 3450, 3500, 3550, 3600, 3650, 3700, 3750, 3800, 3850, 3900, 3900, 3950, 3950, 4000};
        for (double d : tmp) {
            salaires.add(d);            
        }

        for (int i = 1; i < 15; i++) 
        {
            salaires.add(salaires.get(i-1) + 50);



        for (Double element : salaires) {
            System.out.print(element + " ");
        }

        // for (int i = 15; i < 23; i++) {
        //     salaires.add(3000.0);
        //     System.out.print(salaires.get(i)+ " ");
        // }

        System.out.println(" ");


    }
}
