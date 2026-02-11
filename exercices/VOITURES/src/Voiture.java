/**
 * @author TGuinchard
 * @version 1.0
 * @created 11-f�vr.-2026 10:40:08
 */
public class Voiture {

	protected String marque;
	protected String modele;
	protected int	 poids;
	protected Moteur moteur;
	
	// Constructeur à vide
	public Voiture(){
		this.marque = "XXX";
		this.modele = "XXX";
		this.poids  = 1000;
		this.moteur = new Moteur();
	}

	// Constructeur surchargés
	public Voiture(String _marque, String _modele, Moteur _moteur){
		this.marque = _marque;
		this.modele = _modele;
		this.moteur = _moteur;
	}

	public Voiture(String _marque, String _modele, Moteur _moteur, int _poids){
		this.marque = _marque;
		this.modele = _modele;
		this.moteur = _moteur;
		this.poids 	= _poids;
	}

	// Méthodes
	public String toString(){
		return	"\n\033[1;4mAbout vehicule :\033[m\n"
				+ marque
				+ " " 
				+ modele
				+ ", "
				+ poids
				+ " kg\n";
	}

	public int defVitesseMax(){
		int vitesseMax = Moteur.getvMax - (this.poids * 0.30);
		return vitesseMax;
	}

	public String getMarque(){
		return marque;
	}

	public String getModele(){
		return modele;
	}

	public Moteur getMoteur(){
		return moteur;
	}

	public int getPoids(){
		return poids;
	}

	public void setPoids(int newVal){
		poids = newVal;
	}

	public void setMoteur(int newVal){
		moteur = newVal;
	}
}