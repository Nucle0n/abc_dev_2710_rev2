
import java.util.LinkedList;

public class Ecran {

    public static void afficherFraction(Fraction _uneFraction){
        if (_uneFraction.getDenominateur()==1){
            System.out.println(_uneFraction.getNumerateur()+" (Fraction entière)");
        }
        else{
            System.out.println(_uneFraction);
        }
    }

    public static void afficherFraction(LinkedList<Fraction> _uneListe){
        int compteur = 1;
        for (Fraction fraction : _uneListe) {
            System.out.print("Fraction numero " + compteur +" : ");
            afficherFraction(fraction);
            compteur++;
        }
    }
    
}
