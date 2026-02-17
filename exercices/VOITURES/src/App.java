import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String voitMarque, voitModele, motMarque;
        int voitPoids, vMoteur;

        Voiture v1 = new Voiture
        (
            "Peugeot" ,
            "Coupé-406",
            new Moteur("Peugeot 3.0e V6", 240),
            1466
        );
    
        System.out.println(v1);
        System.out.println(v1.moteur);

        System.out.println("---------------------");

    Voiture vc1 = new VoitureDeCourse
        (
            "Renault",
            "Espace F1",
            new Moteur(
                "Renault",
                310),
            1100
        );

        if (vc1.moteur.getMarque() != vc1.getMarque()){
            System.out.println("About VC1 :\nLa marque du moteur ne correspond par à la marque du véhicule.");
        }
        else{
        System.out.println(vc1);
        System.out.println(vc1.getMoteur());
        }

        System.out.println("---------------------");

        System.out.print("Construire une nouvelle voiture de course :\nMarque : ");
        voitMarque = sc.nextLine();
        System.out.print("Modèle : ");
        voitModele = sc.nextLine();
        System.out.print("Poids : ");
        voitPoids = sc.nextInt();
        System.out.print("Construction du morteur : \nMarque du moteur : ");
        sc.nextLine();
        motMarque = sc.nextLine();
        System.out.print("Vitesse moteur : ");
        vMoteur = sc.nextInt();

        System.out.println("Debug :\n"+ voitMarque + " " + voitModele + " " + voitPoids + " kg " + motMarque + " " + vMoteur );
        
        Moteur mbubule = new Moteur(motMarque, vMoteur);

        Voiture vc2 = new VoitureDeCourse(voitMarque, voitModele, mbubule, voitPoids);
        System.out.println(vc2);
        System.out.println(vc2.getMoteur());

        ArrayList<Voiture> garage = new ArrayList<Voiture>();
        garage.add(v1);
        garage.add(vc1);
        garage.add(vc2);
        Voiture v2 = new Voiture("Renault", "R5", new Moteur("Renault", 400), 1500);
        Voiture v3 = new Voiture("Peugeot", "5008", new Moteur("Peugeot", 450), 1800);
        VoitureDeCourse vc3 =  new VoitureDeCourse("Aston Martin", "DB12", new Moteur("Aston Martin", 600), 1200);
        garage.add(v2);
        garage.add(v3);
        garage.add(vc3);

        garage.sort(Comparator.comparing(Voiture::getPoids));
        for (Voiture e : garage) {
            System.out.println(e);
        }
    }



}
