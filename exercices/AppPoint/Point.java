// TP Point

// Ce TP est inspiré par l'exemple utilisé dans les livres de Claude Delannoy sur la programmation objet.

// Un point géométrique dans un espace à deux dimensions est caractérisé par son abscisse -X- et son ordonnée -Y-, valeurs réelles. 
// On assigne un certain nombre de responsabilités à chaque point :

// Se construire soit sans information ( point 0,0), ou avec une valeur pour chaque coordonnéees.
// Indiquer sa position ( abscisse et ordonnée ).
// Se déplacer en modifiant abscisse et ordonnée.
// S'afficher en indiquant les valeurs de ses coordonnées.
// Construire un point symétrique par rapport à l'axe des ordonnées.
// Construire un point symétrique par rapport à l'axe des abscisses.
// Construire un point symétrique par rapport à l'origine.
// Permuter ses coordonnées ( symétrie par rapport à la bissectrice des axes Ox,Oy ).
// Travail à faire :

// 1) Faire un diagramme de classe détaillé ( niveau de visibilité des membres, signature des méthodes )

// Solution.

// 2) Ecrire en Java la déclaration de la classe, avec ses attributs privés.

// 3) Afin de tester les méthodes de la classe Point, écrire une classe AppPoint - enregistrer le fichier sous le nom ExoPoint.cs - qui testera chaque méthode dans sa méthode Point



public class Point {
  double x = 0;
  double y = 0;

  public Point(){
    // x = 5;
    // y = 2;
  }

  public void seDeplacer(double _newX, double _newY){
    this.x = _newX;
    this.y = _newY;
  }
  public void permuter(Point unPoint){
    double temp = unPoint.x;
    unPoint.x = unPoint.y;
    unPoint.y = temp;
  }

  // Symétrie par rapport à l'axe des ordonnées
  public Point symOrdonnees(Point unPoint) {
    return new Point(unPoint.x = -unPoint.x);
    
  }

  // Symétrie par rapport à l'axe des abscisses
  public Point symAbcisses(Point unPoint) {
    unPoint.y = -unPoint.y;
  }
}



















//     // Constructeur avec paramètres
//     public Point(double x, double y) {
//         this.x = x;
//         this.y = y;
//     }

//     // Déplacement ABSOLU
//     public void seDeplacer(double newX, double newY) {
//         this.x = newX;
//         this.y = newY;
//     }

//     // Permutation des coordonnées d'un autre point
//     public void permuter(Point unPoint) {
//         double temp = unPoint.x;
//         unPoint.x = unPoint.y;
//         unPoint.y = temp;
//     }

//     // Symétrie par rapport à l'axe des abscisses
//     public Point symAbscisse(Point unPoint) {
//         return new Point(unPoint.x, -unPoint.y);
//     }

//     // Symétrie par rapport à l'axe des ordonnées
//     public Point symOrdonnees(Point unPoint) {
//         return new Point(-unPoint.x, unPoint.y);
//     }

//     // Symétrie par rapport à l'origine
//     public Point symOrigine(Point unPoint) {
//         return new Point(-unPoint.x, -unPoint.y);
//     }

//     // Redéfinition de toString
//     @Override
//     public String toString() {
//         return "(" + x + ", " + y + ")";
//     }

//     // Accesseurs
//     public double getX() {
//         return x;
//     }

//     public double getY() {
//         return y;
//     }

//     // Modifieurs
//     public void setX(double newVal) {
//         this.x = newVal;
//     }

//     public void setY(double newVal) {
//         this.y = newVal;
//     }
// }