package corrige;

public class Banque {

    private int nbComptes;
    private Compte[] listComptes;

    public Banque(){

        nbComptes = 0;
        listComptes = new Compte[20];
        
    }
        
    public void Init(){
        Compte c1 = new Compte("Toto", 5200, -500);
        Compte c2 = new Compte("Titi", 10200, -500);
        Compte c3 = new Compte("Dupond", 3200, 0);
        Compte c4 = new Compte("Durand", 12200, -2000);
        Compte c5 = new Compte("Dubois", 8000, -200);
        Compte c6 = new Compte("Duval", 2200, 0);

        ajouteCompte(c1);
        ajouteCompte(c2);
        ajouteCompte(c3);
        ajouteCompte(c4);
        ajouteCompte(c5);
        ajouteCompte(c6);

    }

    private void ajouteCompte(Compte unCompte){
        listComptes[nbComptes++] = unCompte;
    }

    public void afficherComptes(){
        System.out.print("\n");
        for (Compte nCompte : listComptes) {
            if (nCompte != null){
            System.out.print(nCompte);
            System.out.print("\n");
            }
        }

    }
    
}
