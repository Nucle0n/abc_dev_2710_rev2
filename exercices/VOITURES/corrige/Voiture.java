/**
 * @author fchatelot
 * @version 1.0
 * @created 16-févr.-2026 14:17:00
 */
public class Voiture  {


protected String marque;
protected String modele;
protected double poids;
protected Moteur leMoteur;

public Voiture(){

}

public void finalize() throws Throwable {
}

public Voiture(String _marquevoiture, String _modelevoiture, double _poids, String _marqueMoteur, double _vitesseMaxMoteur){

this.leMoteur= new Moteur(_vitesseMaxMoteur, _marqueMoteur);
this.marque= _marquevoiture;
this.modele=_modelevoiture;
this.poids=_poids;
}



public Moteur get_lemoteur(){
return this.leMoteur;
}

public String getmarque(){
return this.marque;
}

public String getmodele(){
return this.modele;
}

public double getpoids(){
return this.poids;
}

/**
  * 
  * @param newVal
  */
public void set_lemoteur(Moteur newMoteur){
this.leMoteur = newMoteur;
}

/**
  * 
  * @param newVal
  */
public void setpoids(double newVal){
poids = newVal;
}
@Override
/**
 *  Afficher la voiture et du moteur
 * @return chaine caractère
 */

public String toString(){
return "Vehicule: \nMarque "+ this.marque+ "\nModele: "+this.modele +"\nPoids: "+ this.poids +" kg \n Ayant pour Moteur :\n"+ this.leMoteur.toString();
}

public int CalculVitesseMax(){

int vitesseVoiture= (int)(this.leMoteur.getvitesseMax()- (this.poids*0.3));
if (vitesseVoiture<0) {
return 0;
}
return vitesseVoiture;
}
}