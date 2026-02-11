/**
 * @author TGuinchard
 * @version 1.0
 * @created 11-fevr.-2026 13:29:11
 */
public class Moteur {
	// Attributs
	protected String marque;
	protected int vMax;

	// Accesseurs & Modifieurs
	public String getMarque(){
	return marque;
	}

	public int getvMax(){
		return vMax;
	}

	public void setvMax(int newVal){
		vMax = newVal;
	}

	// Constructeur à vide
	public Moteur(){
		this.marque = "XXX";
		this.vMax 	= 0;
	}
	
	// Constructeur surchargé
	/**
	 *
	 * @param _marque
	 * @param _vitesse
	 */
	public Moteur(String _marque, int _vMax){
		this.marque = _marque;
		this.vMax = _vMax;
	}
}