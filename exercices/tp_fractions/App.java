
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        
        Fraction    f0 = new Fraction(),
                    f1 = new Fraction(9),
                    f2 = new Fraction(12, 7),
                    f3 = new Fraction(120, -150);

        LinkedList <Fraction> maLinkedList= new LinkedList<Fraction>();
        maLinkedList.add(f0);
        maLinkedList.add(f1);
        maLinkedList.add(f2);
        maLinkedList.add(f3);

        Ecran.afficherFraction(maLinkedList);
    }
}
