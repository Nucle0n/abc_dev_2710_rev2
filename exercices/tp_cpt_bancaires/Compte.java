
/**
 * @author TGuinchard
 * @version 1.0
 * @updated 26-janv.-2026 14:17:29
 */
public class Compte {

	// Attributs
	private long id;
	private double decouvert;
	private String ownerName;
	private double solde;

	
	// constructeur
	public Compte(){
		this.ownerName 	= "";
		this.id 		= 0;
		this.decouvert 	= 0;
		this.solde 		= 0;
	}

	// Constructeurs surchargé
	public Compte(String _ownerName, long _id, double _solde, double _decouvert){
		this.ownerName 	= _ownerName;
		this.id 		= _id;
		this.decouvert 	= _decouvert;
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

	public double getdecouvert(){
		return decouvert;
	}

	public double setdecouvert(double newVal){
		decouvert = newVal;
	}

	////////-------------------------------
	
	public void credit(double add){
		solde += add;
	}

	public boolean verifDebit(double retrait){
		return (retrait >= solde - decouvert); // "Si" induit. Si remove est supérieur ou égale solde moins le montant (négatif - - = +) retiré la condition est validée donc true
	} 

	public void debit(double retrait){
		solde -= retrait
	}


	public boolean superieur(Compte autreCompte){
		return id > autreCompte;
	}

	public String toString(){
		return "";
	}

	public void transfert(Compte autreCompte, double montant){
		id -= montant;
		autreCompte += montant;
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