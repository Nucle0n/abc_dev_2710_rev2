/**
 * @author TGuinchard
 * @version 1.0
 * @created 11-fevr.-2026 13:29:11
 */
public class Moteur 
{

	// Attributs
	protected String marque;
	protected int vMax;

	// Accesseurs
	public String getMarque()
	{
	return marque;
	}

	public int getvMax()
	{
		return vMax;
	}
	
	// Modifieurs
	public void setvMax(int newVal)
	{
		vMax = newVal;
	}

	// Constructeur à vide
	public Moteur()
	{
		this.marque = "XXX";
		this.vMax 	= 0;
	}
	
	// Constructeur surchargé
	public Moteur(String _marque, int _vMax)
	{
		this.marque = _marque;
		this.vMax = _vMax;
	}

	// Méthodes
	public String toString()
	{
	return 	"\033[1;4mAbout motor :\033[m\n"
			+ "Brand : "+ marque + "\n"
			+ "S_Max : " + vMax + " km/h\n";
	}

}