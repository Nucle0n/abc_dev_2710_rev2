/**
 * @author TGuinchard
 * @version 1.0
 * @created 11-fevr.-2026 13:29:03
 */
public class VoitureDeCourse extends Voiture {

	public VoitureDeCourse(String _marque, String _modele, Moteur _moteur, int _poids){
		super(_marque, _modele, _moteur, _poids);
	}

	public int defVitesseMax(){
		return this.moteur.getvMax() - (int)(this.poids * 0.05);
	}

	public String toString(){
		return 	"\n\033[1;4mAbout SuperCar :\033[m\n"
				+ marque + " "
				+ modele + ", "
				+ poids + " Kg. "
				+ "Max Speed : "
				+ defVitesseMax() + " km/h\n";
	}

}