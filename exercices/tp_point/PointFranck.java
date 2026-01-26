public class PointFranck {

    // Attributs
    private double X;
    private double Y;

    // Propréités
    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }

    public void setX(double newVal){
        this.X = newVal;
    }

    public void setY(double newVal){
        this.Y = newVal;
    }
    

    // Constructeurs (donne une forme définitive à l'objet)

    // Constructeur à vide (par defaut /  le point à l'origine)
    public PointFranck(){
        this.X = 0;
        this.Y = 0;
    }

    public PointFranck(double _X, double _Y){
        this.X = _X;
        this.Y = _Y;
    }

    public void permuter(){
        double temp = this.X;
        this.X = this.Y;
        this.Y = temp;
    }

    public void seDeplacer(double _newX, double _newY){
        this.X += _newX;
        this.Y += _newY;
    }

    public PointFranck symAbscisse(){
        PointFranck symAPoint = new PointFranck(this.X,-this.Y);
        return symAPoint;
    }

    
    public PointFranck symOrdonnees(){
        PointFranck symOPoint = new PointFranck(-this.X,this.Y);
        return symOPoint;
    }

    public PointFranck symOrigine(){
        PointFranck symOriPoint = new PointFranck(-this.X,-this.Y);
        return symOriPoint;
    }

    public String toString(){
        return "(Point "+(int)this.X+","+(int)this.Y+")"; // (int) Converti le résultat en entier, attention donc !
    }

    public double calculDistance(PointFranck autrePoint){
        double distance = Math.sqrt(Math.pow( (autrePoint.getX() - this.X),2) + Math.pow( (autrePoint.getY() - this.Y),2));
        return Math.round(distance);
    }


}
