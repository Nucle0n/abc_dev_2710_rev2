package corrige;

public class Banque {

    private int         nbComptes;
    private Compte[]    listComptes;
    private String      nomBanque;         

    // Constructeurs
    public Banque(String _nomBanque){
        this.nbComptes = 0;
        this.listComptes = new Compte[20];
        this.nomBanque = _nomBanque;
    }

    public void ajouteCompte(Compte unCompte){
        listComptes[nbComptes] = unCompte;
        nbComptes++;
    }

    public void ajouterNouveauCompte(String _nom, double _solde, double _decouvertAutorise){
        Compte unCompte = new Compte(_nom, _solde, _decouvertAutorise);
        this.ajouteCompte(unCompte);
    }


    public void Init(){
        Compte c1 = new Compte("Toto", 5200.52875, -500);
        Compte c2 = new Compte("Titi", 10200.4632, -500);
        Compte c3 = new Compte("Dupond", 3200.455, 0);
        Compte c4 = new Compte("Durand", 12200, -2000);
        Compte c5 = new Compte("Dubois", 8000, -200);
        CompteEpargne c6 = new CompteEpargne("Duval", 2200, 0,0.015);

        this.ajouteCompte(c1);
        this.ajouteCompte(c2);
        this.ajouteCompte(c3);
        this.ajouteCompte(c4);
        this.ajouteCompte(c5);
        this.ajouteCompte(c6);

    }

    public void afficherComptes(){
        System.out.print("\n");
        for (Compte element : listComptes) {            
            if (element != null){
            System.out.print(element);
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
            // else{
            //     System.out.println("\033[3m\"Null\"\033[0m");
            // }
        }
        return listComptes[indice];
    }

    // Méthode plus académique pour compteSup
    
    // public Compte compteSup(){
    //     Compte max = listComptes[0];
    //     // int positionMax = 0;
    //     for (int i = 1; i < nbComptes; i++) {
    //         if (listComptes[i].getsolde() > max.getsolde()){
    //             max = listComptes[i];
    //             // positionMax = i;
    //         }
    //     }
    //     return max;
    // }

    public Compte rendCompte(int _numero){
        for (int i = 0; i < nbComptes; i++) {
            if (listComptes[i].getnumero() == _numero)
            return listComptes[i];
        }
        return null;
        

    }


    
}
