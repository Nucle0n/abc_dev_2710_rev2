public class App {
    public static void main(String[] args)
    {
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

        System.out.println(vc1);
        System.out.println(vc1.getMoteur());
    
    }
}
