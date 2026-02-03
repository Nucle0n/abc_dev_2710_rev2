package corrige;

public class Banque {

    private int nbComptes;
    private Compte[] listComptes;

    public Banque(){

        nbComptes = 0;
        listComptes = new Compte[20];
        
    }
        
    public void Init(){
        Compte c1 = new Compte("Toto", 5200.52875, -500);
        Compte c2 = new Compte("Titi", 10200.4632, -500);
        Compte c3 = new Compte("Dupond", 3200.455, 0);
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

    public void ajouteCompte(Compte unCompte){
        listComptes[nbComptes++] = unCompte;
    }

    public void afficherComptes(){
        System.out.print("\n");
        for (Compte nbCompte : listComptes) {
            if (nbCompte != null){
            System.out.print(nbCompte);
            System.out.print("\n");
            }
        }
    }

    public Compte compteSup(){
        double temp = 0;
        int indice = 0;
        for (int i = 0; i < nbComptes; i++) {
            if (listComptes[i].getsolde() > temp){
                temp = listComptes[i].getsolde();
                indice = i;
            }
        }
        return listComptes[indice];
    }

    // public Compte rendCompte(int _numero){
    //     for (int i = 0; i < nbComptes; i++) {
    //         if (listComptes[i].getnumero == _numero)

    //     }

    // }


    
}
