import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import voiture.Voiture;
import voiture.VoitureCourse;

public class App {
    public static void main(String[] args) throws Exception {

        Voiture maVoiture = new Voiture("Renault", "TWINGO", 1200, "Nissan", 450);
        int vitesseMax = maVoiture.CalculVitesseMax();
        System.out.println(maVoiture + "\nVoiture ayant pour vitesse Max :" + vitesseMax);
        try {
            VoitureCourse voitureLoisir = new VoitureCourse("Renault", "Alpine", 1200, "Renault", 450);

            System.out.println("<<<<<<<<<<<<<<<<<< Voiture de Course >>>>>>>>>>>>>>>>>>>>>>>>>>>> \n");
            System.out.println(voitureLoisir);

            ArrayList<Voiture> garageList = new ArrayList<Voiture>();
            garageList.add(maVoiture);
            garageList.add(voitureLoisir);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}