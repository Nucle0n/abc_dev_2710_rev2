

/**
 * @author TGuinchard
 * @version 1.0
 * @created 09-f�vr.-2026 13:32:28
 */
public class Fraction {

	// Attributs
	private int numerateur;
	private int denominateur;

	// Constructeurs
	public Fraction(){
		this.numerateur = 0;
		this.denominateur = 1;
	}

	// Constructeurs surchargés
		/**
	 * 
	 * @param _numerateur
	 */
	public Fraction(int _numerateur){
		this.denominateur = 1;
		this.numerateur = _numerateur;
	}

	/**
	 * 
	 * @param _denominateur
	 * @param _numerateur
	 */
	public Fraction(int _denominateur, int _numerateur){
		this.denominateur = _denominateur;
		this.numerateur = _numerateur;
	}

	// Méthodes

	public String toString(){
		return "Fraction : "+numerateur+"/"+denominateur;
	}

	private int GetPgcd(){
		return 0;
	}

	private void Reduire(){

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

	public void Oppose(){

	}

	public void Inverse(){

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





}