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
	
	public Voiture(){
		this.marque = "XXX";
		this.modele = "XXX";
		this.poids  = 1000;
		this.moteur =
	}

	public Voiture voiture(){
		return null;
	}

	/**
	 * 
	 * @param _marque
	 * @param _modele
	 * @param _moteur
	 */
	public Voiture voiture(String _marque, String _modele, Moteur _moteur){
		return null;
	}

	/**
	 * 
	 * @param _marque
	 * @param _modele
	 * @param _moteur
	 * @param _poids
	 */
	public Voiture voiture(String _marque, String _modele, Moteur _moteur, int _poids){
		return null;
	}

	public int defVitesseMax(){
		return 0;
	}

	public String toString(){
		return "";
	}

	public String getMarque(){
		return marque;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMarque(String newVal){
		marque = newVal;
	}

	public String getModele(){
		return modele;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setModele(String newVal){
		modele = newVal;
	}

	public int getPoids(){
		return poids;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPoids(int newVal){
		poids = newVal;
	}

	public int getMoteur(){
		return moteur;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMoteur(int newVal){
		moteur = newVal;
	}

}