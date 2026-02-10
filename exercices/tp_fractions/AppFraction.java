import java.util.Scanner;

public class AppFraction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numerateur;
        int denominateur;

        System.out.print("Numérateur : ");
        numerateur = sc.nextInt();
        
        System.out.print("Dénominateur : ");
        denominateur = sc.nextInt();

        Fraction fraction = new Fraction(denominateur, numerateur);

        double resf = (double)fraction.getNumerateur() / (double)fraction.getDenominateur();

        System.out.print("Numérateur : ");
        numerateur = sc.nextInt();
        
        System.out.print("Dénominateur : ");
        denominateur = sc.nextInt();

        Fraction fraction2 = new Fraction(denominateur, numerateur);

        // double resf2 = (double)fraction.getNumerateur() / (double)fraction.getDenominateur();

        


        sc.close();
    }
}