import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        double moyenne, mediane;


        ArrayList<Double> salaires = Methodes.salairesListe();        

        for (Double element : salaires) {
            System.out.print(element + " ");
        }

        System.out.print("\nTaille de l'arraylist : "+ salaires.size());

        System.out.println("");

        moyenne = Methodes.moyenne(salaires);
        System.out.println("Moyenne : "+ moyenne);

        mediane = Methodes.mediane(salaires);
        System.out.println("Mediane : "+ mediane);


    }
}
