/**
 * @author fchatelot
 * @version 1.0
 * @created 16-févr.-2026 14:17:04
 */
public class VoitureCourse extends Voiture {

    public VoitureCourse() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    /**
     * 
     * @param _marquevoiture
     * @param _modelevoiture
     * @param _poids
     * @param _maqueMoteur
     * @param _vitesseMaxMoteur
     */
    public VoitureCourse(String _marquevoiture, String _modelevoiture, double _poids, String _marqueMoteur,
            double _vitesseMaxMoteur) {

        if (!_marquevoiture.equals(_marqueMoteur)) {
            throw new IllegalArgumentException("le moteur et la voiture doivent être de même marque");
        }
    }

    @Override
    public int CalculVitesseMax() {

        int resultat = (int) (this.leMoteur.getvitesseMax() - this.poids * 0.05);
        if (resultat < 0) {
            return 0;

        }
        return resultat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nde  vitesse max : " + this.CalculVitesseMax() + "km/heure";
    }

}