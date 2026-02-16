import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        double moyenne, mediane;


        ArrayList<Double> salaires = Methodes.salairesListe();        

        for (Double element : salaires) {
            System.out.print(element + " ");
        }

        System.out.print("\n\n\033[1;4;38;2;0;50;225mTaille de l'arraylist :\033[0m "+ salaires.size());

        System.out.println("");

        moyenne = Methodes.moyenne(salaires);
        System.out.println("\n\033[1;4;38;2;225;225;0mMoyenne :\033[0m "+ moyenne);

        mediane = Methodes.mediane(salaires);
        System.out.println("\n\033[1;4;38;2;225;225;0mMediane :\033[0m "+ mediane);


    }
}
