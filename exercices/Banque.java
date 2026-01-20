package exercices;

import java.util.*;

public class Banque {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double  capital = 1;
        int     nbmois;
        int     numeroMois = 1;
        double  partInteret,
                partCapital,
                capitalRestant = capital;

        System.out.println(" Veuiller saisir le capital à emprunter :");
        capital = sc.nextDouble();
        System.out.println("Veuiller saisir le taux d'intérêt annuel ");
        double tauxmensuel = (sc.nextDouble()) / 1200;
        System.out.println("Veuiller saisir la durée dde remboursement (en années)");
        nbmois = (sc.nextInt()) * 12;
        double mensualite = Banque.calculMensualite(capital, nbmois, tauxmensuel);

        System.out.printf("Votre mensualité de rembourserment sera de %.2f Euros ", mensualite);



        do {
            partInteret = capitalRestant * tauxmensuel;
            partCapital = mensualite - partInteret;

            // if (numeroMois > 1) {

            //     // k(n+1) = k(n)-part_Capital(n)
            //     capitalRestant -= partCapital;
            
                
            // }
            // else {
                
            // }
            
            // part_Intert(n+1) = k(n)*tm

            System.out.printf("numMois : %d // partIntérêt : %.1f // partCapital : %1.f // capitalRestant : %.0f // mensualité : %0f",numeroMois, partInteret, partCapital, capitalRestant, mensualite);
            
            numeroMois++;

        } while (numeroMois <= nbmois);

    }

    private static double calculMensualite(double _capital, int _nbmois, double _tauxmensuel) {

        // Q= (1-(1+ tm )puissance-n)
        // a= K x tm/Q

        double Q = (1 - Math.pow((1 + _tauxmensuel), -_nbmois));
        double mensualite = (_capital * _tauxmensuel) / Q;

        return mensualite;

    }

    // public static double calculMensualite( double _cap, double _tauxannuel )
    // {
    // double mensualite=0;

    // return mensualite;

    // }
    // public static double calculMensualite( double cap )
    // {
    // double mensualite=0;

    // return mensualite;

    // }

}