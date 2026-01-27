
/**
 * @author TGuinchard
 * @version 1.0
 * @updated 26-janv.-2026 14:17:29
 */
public class Compte {

	// Attributs
	private long id;
	private int overdraft;
	private String ownerName;
	private double solde;

	
	// constructeur
	public Compte(){
		this.ownerName 	= "";
		this.id 		= 0;
		this.overdraft 	= 0;
		this.solde 		= 0;
	}

	// Constructeurs surchargé
	public Compte(String _ownerName, long _id, double _solde, double _overdraft){
		this.ownerName 	= _ownerName;
		this.id 		= _id;
		this.overdraft 	= _overdraft;
		this.solde 		= _solde;
	}

	// Propriétés
	
	public String getownerName(){
		return ownerName;
	}

	public String setowneName(String newString){
		ownerName = newString;
	}

	public long getid(){
		return id;
	}

	public long setid(long newVal){
		id = newVal;
	}

	public double getsolde(){
		return solde;
	}

	public double setsolde(double newVal){
		solde = newVal;
	}

	public double getoverdraft(){
		return overdraft;
	}

	public double setoverdraft(double newVal){
		overdraft = newVal;
	}

	////////-------------------------------

	public void setoverdraft(int newVal){
		overdraft = newVal;
	}

	
	
	/**
	 * 
	 * @param add
	 */
	public void credit(double add){
		solde += add;
	}

	/**
	 * 
	 * @param remove
	 */
	public boolean verifDebit(double remove){
		if (remove > solde - overdraft)
			return false;
	} 

	public void debit(double remove){
		solde -= remove
	}



	/**
	 * 
	 * @param autreCompte
	 */
	public boolean superieur(Compte autreCompte){
		return false;
	}

	public String toString(){
		return "";
	}

	/**
	 * 
	 * @param autreCompte
	 * @param montant
	 */
	public boolean transfert(Compte autreCompte, double montant){
		return false;
	}

	// public String creerCompte(String _nom){
	// 	long timestamp = Instant.now().toEpochMilli();
	// 	String id = String.valueOf(timestamp);

	// 	try (BufferedWriter writer= new BufferedWriter(new FileWriter(FICHIER,true))){
	// 		writer.write(nom + ";" + id);
	// 		writer.newLine();
	// 	}
	// 	catch (IOException e){
	// 		System.out.println("Erreur lors de la creation du compte");
	// 	}
    //     return id;
    // }

}