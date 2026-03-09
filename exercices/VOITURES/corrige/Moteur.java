/**
 * @author fchatelot
 * @version 1.0
 * @created 16-févr.-2026 14:17:03
 */
public class Moteur {

    private String marque;
    private double vistesseMax;

    public void finalize() throws Throwable {

    }

    // Constructeur avec parametre
    public Moteur(double _vitesseMax, String _marque) {

        this.vistesseMax = _vitesseMax;
        this.marque = _marque;

    }

    // propriétés
    public String getmarque() {
        return this.marque;
    }

    public double getvitesseMax() {
        return this.vistesseMax;
    }

    public void setvistesseMax(double newVal) {
        vistesseMax = newVal;
    }

    @Override
    /**
     * Affiche le moteur et ses spécifications
     * 
     * @return chaine de caractère
     */
    public String toString() {
        return "Moteur de marque : " + this.marque + " et de vitesse max :" + this.vistesseMax + " km/heure";
    }

}