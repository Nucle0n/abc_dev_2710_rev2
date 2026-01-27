import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import javax.imageio.IIOException;

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

	// Propriétés
	
	public final void Compte(){

	}

	/**
	 * 
	 * @param _ownerName
	 * @param _id
	 * @param _solde
	 * @param _overdraft
	 */
	public final void Compte(String _ownerName, long _id, double _solde, double _overdraft){

	}

	/**
	 * 
	 * @param add
	 */
	public double credit(double add){
		return 0;
	}

	/**
	 * 
	 * @param remove
	 */
	public boolean debit(double remove){
		return false;
	}

	public long getid(){
		return id;
	}

	public int getoverdraft(){
		return overdraft;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setid(int newVal){
		id = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setoverdraft(int newVal){
		overdraft = newVal;
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

	public String creerCompte(String _nom){
		long timestamp = Instant.now().toEpochMilli();
		String id = String.valueOf(timestamp);

		try (BufferedWriter writer= new BufferedWriter(new FileWriter(FICHIER,true))){
			writer.write(nom + ";" + id);
			writer.newLine();
		}
		catch (IOException e){
			System.out.println("Erreur lors de la creation du compte");
		}
        return id;
    }

}