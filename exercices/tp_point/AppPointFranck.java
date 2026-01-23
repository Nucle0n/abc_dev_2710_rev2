import java.util.Scanner;


public class AppPointFranck{

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        double X,Y;
        System.out.print("Entrez une valeur pour X : ");
        X = sc.nextDouble();
        System.out.print("Entrée une valeur pour Y : ");
        Y = sc.nextDouble();


        PointFranck A = new PointFranck(X,Y);
        System.out.println("Emplacement du point : "+A);
        
        System.out.print("Déplacement du point en X : ");
        double addToX = sc.nextDouble();
        System.out.print("Déplacement du point en Y : ");
        double addToY = sc.nextDouble();

        A.seDeplacer(addToX,addToY);
        System.out.println("Emplacement du point après déplacement : "+A);

        PointFranck pointSymX = A.symAbscisse();
        System.out.println("Point symétrique en Abscisse : "+pointSymX);

        double segment = A.calculDistance(pointSymX);
        System.out.println("Longueur du segment (A,symA) : "+segment);

        PointFranck pointSymY = A.symOrdonnees();
        System.out.println("Point symétrique en Ordonnée : "+pointSymY);

        segment = A.calculDistance(pointSymY);
        System.out.println("Longueur du segment (A,symY) : "+segment);

        PointFranck pointSymO = A.symOrigine();
        System.out.println("Point symétrique par rapport à l'origine : "+pointSymO);

        segment = A.calculDistance(pointSymO);
        System.out.println("Longueur du segment (A,symO) : "+segment);


        sc.close();
    }


}