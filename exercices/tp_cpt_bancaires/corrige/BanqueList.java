package corrige;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BanqueList {
    // Attributs
    private String nomBanque;

    // Collection d'objet (tableau dynamique)
        // LinkedList utile si on insère beaucoup de données en milieu de liste (plus rapide en écriture)
        // Accepte les cases null et les doublons
    List listComptes2 = new LinkedList();
    
        // ArrayList meilleures pourl'accès en lecture d'un grand nombre d'objets .get(int index)
    ArrayList listComptes = new ArrayList();

    // Constructeurs
    public BanqueListe(String _nomBanque){
        this.nomBanque = _nomBanque;
    }

    public void init(){
        Compte          c1 = new Compte("Toto", 5200.52875, -500);
        Compte          c2 = new Compte("Titi", 10200.4632, -500);
        Compte          c3 = new Compte("Dupond", 3200.455, 0);
        Compte          c4 = new Compte("Durand", 12200, -2000);
        Compte          c5 = new Compte("Dubois", 8000, -200);
        CompteEpargne   c6 = new CompteEpargne("Duval", 2200, 0,0.015);

        listComptes.add(c1);
        listComptes.add(c2);
        listComptes.add(c3);
        listComptes.add(c4);
        listComptes.add(c5);
        listComptes.add(c6);
    }

    public void afficherComptes(){
        for (int i = 0; i < listComptes.size(); i++) {
            System.out.println(listComptes.get(i));
        }
    }

    



    
}
