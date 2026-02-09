

/**
 * @author TGuinchard
 * @version 1.0
 * @created 09-f�vr.-2026 13:32:28
 */
public class Fraction {

	// Attributs 
	private int Numerateur;
	private int Denominateur;

	public Fraction(){

	}

	public void finalize() throws Throwable {

	}

	public int GetPgcd(){
		return 0;
	}

	public void Reduire(){

	}

	/**
	 * 
	 * @param uneFraction
	 */
	public boolean Superieur(Fraction uneFraction){
		return false;
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public boolean Inferieur(Fraction uneFraction){
		return false;
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public boolean Egal(Fraction uneFraction){
		return false;
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public Fraction Somme(Fraction uneFraction){
		return null;
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public Fraction Difference(Fraction uneFraction){
		return null;
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public Fraction Produit(Fraction uneFraction){
		return null;
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public Fraction Quotient(Fraction uneFraction){
		return null;
	}

	/**
	 * 
	 * @param Exposant
	 */
	public Fraction Puissance(int Exposant){
		return null;
	}

	public int getNumerateur(){
		return Numerateur;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNumerateur(int newVal){
		Numerateur = newVal;
	}

	public int getDenominateur(){
		return Denominateur;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDenominateur(int newVal){
		Denominateur = newVal;
	}

	public void Oppose(){

	}

	public void Inverse(){

	}

}