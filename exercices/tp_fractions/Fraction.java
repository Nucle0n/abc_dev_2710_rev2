/**
 * @author TGuinchard
 * @version 1.0
 * @created 09-f�vr.-2026 13:32:28
 */
public class Fraction {

	// Attributs
	private int numerateur;
	private int denominateur;

	// propriétés

	public int getNumerateur(){
		return this.numerateur;
	}

	public int getDenominateur(){
		return this.denominateur;
	}

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
		this.numerateur = _numerateur;
		this.denominateur = 1;
	}

	/**
	 * 
	 * @param _denominateur
	 * @param _numerateur
	 */
	public Fraction(int _numerateur, int _denominateur){
		
		double res;
		this.numerateur = _numerateur;
			
		try {
			res = this.numerateur/_denominateur;

			this.denominateur = _denominateur;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+" division par zero impossible");
		}
		this.reduire();
	}

	// Méthodes

	public String toString(){
		return this.numerateur + "/" + this.denominateur;
	}

	public void inverse(){
		int temp;
		temp = this.numerateur;
		this.numerateur = this.denominateur;
		this.denominateur = temp;
		this.reduire();
	}

	public void oppose(){
		this.numerateur *= (-1);
	}

	private int getPgcd(){
		int a = this.numerateur;
		int b = this.denominateur;
		int pgcd=-1;
		if ( a!=0 && b!=0)
		{
		if ( a<0 ) a =-a;
		if ( b<0 ) b =-b;
		while ( a!=b )
		if ( a<b )
		b -= a;
		else
		a -=b;
		pgcd = a;
		}
return pgcd;
}

	private void reduire(){
		int pgcd = this.getPgcd();
		this.numerateur /= pgcd;
		this.denominateur /= pgcd;
		if (this.denominateur < 0){
			this.numerateur *= -1;
			this.denominateur *= -1;
		}
	}

	/**
	 * 
	 * @param uneFraction
	 */
	public Fraction somme(Fraction _uneFraction){
		int termNum	 = this.numerateur * _uneFraction.getDenominateur() + _uneFraction.getNumerateur() * this.denominateur;
		int termDeno = this.denominateur * _uneFraction.getDenominateur();
	
		Fraction resultat = new Fraction(termNum, termDeno);

		return resultat;
	}

	/**
	 *
	 * @param uneFraction
	 */
	public Fraction difference(Fraction _uneFraction){
		
		Fraction newFraction;
		_uneFraction.oppose();
		newFraction = this.somme(_uneFraction);
		//optionel
		_uneFraction.oppose();
		newFraction.reduire();

		return newFraction;
	}

	/**
	 *
	 * @param uneFraction
	 */
	public boolean superieur(Fraction _uneFraction){

		double res1 = (double)this.numerateur / (double)this.denominateur;
		double res2 = (double)_uneFraction.getNumerateur()/(double)_uneFraction.getDenominateur();
		return  res1 > res2;
		}

	/**
	 *
	 * @param uneFraction
	 */
	public boolean inferieur(Fraction _uneFraction){

		double res1 = (double)this.numerateur / (double)this.denominateur;
		double res2 = (double)_uneFraction.getNumerateur()/(double)_uneFraction.getDenominateur();
		return  res1 < res2;
	}

	/**
	 *
	 * @param uneFraction
	 */
	public boolean egal(Fraction _uneFraction){

		double res1 = (double)this.numerateur / (double)this.denominateur;
		double res2 = (double)_uneFraction.getNumerateur()/(double)_uneFraction.getDenominateur();
		return  res1 == res2;
	}

	/**
	 *
	 * @param uneFraction
	 */
	public Fraction produit(Fraction _uneFraction){
		int newNum = this.numerateur * _uneFraction.getNumerateur();
		int newDen = this.denominateur * _uneFraction.getDenominateur();

		Fraction newFraction = new Fraction(newNum, newDen);

		return newFraction;
	}

	/**
	 *
	 * @param uneFraction
	 */
	public Fraction quotient(Fraction _uneFraction){

		_uneFraction.inverse();
		return this.produit(_uneFraction);
		
	}

	/**
	 *
	 * @param Exposant
	 */
	public Fraction Puissance(int _Exposant){

		double newNum = Math.pow((double)this.numerateur, _Exposant);
		double newDen = Math.pow((double)this.denominateur, _Exposant);

		Fraction newFraction = new Fraction((int)newNum, (int)newDen);

		return newFraction;
	}
}