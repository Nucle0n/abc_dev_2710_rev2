package corrige;

public class AppBanque {
    public static void main(String[] args) {
        
        Banque b = new Banque();
        b.Init();

        b.afficherComptes();

        b.ajouteCompte(new Compte("Dutronc", 4500, -500));

        System.out.println("\n--------------\nAjout du compte de Mr Dutronc :");
        b.afficherComptes();

        
        System.out.println("\n"+b.compteSup());

    }
}
