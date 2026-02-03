package corrige;

import java.time.LocalDateTime;

public class Compte {
    //attributs
    private double decouvertAutorise;
    protected String nomPropietaire;
    protected int numero;
    protected double solde;

    // permet d'effectuer des opérations de finalisation en général une opération de nettoyage d'un objet avant que le système de Garbage Collector ne s'en charge

    public void finalize() throws Throwable {
        super.finalize();

    }

    // propriétés accesseurs
    public double getdecouvertAutorise() {
        return decouvertAutorise;
    }

    public String getnomPropietaire() {
        return nomPropietaire;
    }

    public int getnumero() {
        return numero;
    }

    public double getsolde() {
        return solde;
    }

    // propriétés modifieurs
    public void setdecouvertAutorise(double newVal) {
        decouvertAutorise = newVal;
    }

    public void setsolde(double newVal) {
        solde = newVal;
    }

    public boolean setnomProprietaire(String _nouvNom) {
        if (this.nomPropietaire.equals("sans nom")) {

            this.nomPropietaire = _nouvNom;
            return true;
        } else {
            return false;
        }
    }

    // constructeur avec paramètres

    public Compte(String _nomProprio, double _solde, double _decouvertAutorise) {
        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = Math.abs(locTimes.hashCode());
        this.nomPropietaire = _nomProprio;
        this.solde = _solde;
        this.decouvertAutorise = _decouvertAutorise;

    }
    // constructeur à vide

    public Compte() {
        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = locTimes.hashCode();
        this.nomPropietaire = "sans nom";
        this.solde = 0;
        this.decouvertAutorise = 0;

    }

    /**
     * Créditer un compte d'un montant en €
     * 
     * @param _montant
     * @return ne renvoie rien
     */
    public void crediter(double _montant) {
        this.solde += _montant;

    }

    /**
     * Debiter un compte d'un montant en €
     * 
     * @param _montant
     * @return renvoie un booleen true si le debit est autorisé sinon false
     */
    public boolean debiter(double _montant) {
        if (this.solde - _montant >= this.decouvertAutorise) {

            this.solde -= _montant;
            return true;
        }
        return false;
    }

    /**
     * Faire un virement vers un autre compte d'un montant
     * 
     * @param _montant
     * @param _autreCompte
     * @return renvoie un booleen true si le virement est effectué sinon false
     */

    public boolean transferer(double _montant, Compte _autreCompte) {
        if (this.debiter(_montant)) {
            _autreCompte.crediter(_montant);
            return true;
        }
        return false;

    }

    /**
     * Comparer deux comptes
     * 
     * @param _autreCompte
     * @return renvoie un booleen true si le solde du compte courant est supérieur
     *         ou egal à celui du compte passé en paramètre sinon false
     */
    public boolean superieur(Compte _autreCompte) {
        return this.solde >= _autreCompte.solde;
    }

    /**
     * afficher l'etat du compte
     * 
     * @return renvoie la chaine de description du compte
     */
    public String toString() {
        return "Compte n° \033[38;2;255;235;18m5500" + this.numero +"\033[m"+
                "\tPropriétaire: \033[38;2;18;156;255m" + this.nomPropietaire +"\033[m"+
                "\tSolde: \033[38;2;255;235;18m" + arrondi(this.solde) +"\033[m"+ "€" +
                "   \tDécouvert autorisé: \033[38;2;255;235;18m" + arrondi(this.decouvertAutorise) +"\033[m"+ "€";
    }

    public static double arrondi(double _unNombre){
        return Math.round(_unNombre*100.0)/100.0;
    }


}