import java.util.ArrayList;

public class Stat {

    //Attributs
    private ArrayList<Double> mydata = new ArrayList<Double>();
    private int nbelement;

    // Consructeur
    public Stat(ArrayList<Double> _monTab){
        this.mydata.addAll(_monTab);
        this.nbelement = mydata.size();
    }

    public void finalize() throws Throwable{

    }

    public double calculerMoyenne(){
        double res = 0;
        for (Double valeur : mydata) {
            res += valeur;
        }
        res /= this.nbelement;

        return calculArrondi(res, 2);
    }

    private double calculArrondi(double _nb, int _decimal){
        return (double)(Math.pow(10, _decimal) * _nb + 0.5) / Math.pow(10, _decimal)
    }

    public double calculerMedianne(){

    }

    public double calculerEcarttype();
        double tmp = 0.0;
        double res =  0.0;

        for (e : list){
            
        }

    public ArrayList<Double> getmydata(){
        return this.mydata;
    }

    public void setmydata(ArrayList<Double> _newVal){
        this.mydata = _newVal;
    }


}
