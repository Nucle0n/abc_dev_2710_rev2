package corrige.com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stat {

    //Attributs
    private ArrayList<Double> mydata = new ArrayList<Double>();
    private int nbelement;

    // Consructeur
    public Stat(ArrayList<Double> _monTab){
        this.mydata.addAll(_monTab);
        Collections.sort(this.mydata);
        // mydata.sort(Comparator.naturalOrder()); // >= java 8
        // mydata.sort(Comparator.reverseOrder());
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
        return (double)(long)(Math.pow(10, _decimal) * _nb + 0.5) / (long)Math.pow(10, _decimal);
    }

    public double calculerMedianne(){

        if (nbelement % 2 == 0)
            {
                double mediane = (mydata.get(this.nbelement / 2) + mydata.get( (this.nbelement/2) - 1) ) / 2;
                return mediane;
            }

        return mydata.get(this.nbelement / 2);
    }

    public double calculerEcartType(){
        double tmp = 0.0;
        final double MOYENNE = this.calculerMoyenne();

        for (double valeur : this.mydata){
            tmp += Math.pow((valeur - MOYENNE),2);            
        }
        tmp /=this.nbelement;

        return calculArrondi((Math.sqrt(tmp)),2);
    }

    public double [] calculerQuartile(){
        
        double[] quartilesTab = new double[3];

        // quartilesTab[0] = mydata.get( ( ((    nbelement + 3)) / 4)  - 1);
        // quartilesTab[1] = mydata.get( ( (     nbelement + 1)  / 2)  - 1);
        // quartilesTab[2] = mydata.get( ( ((3 * nbelement + 1)  / 4)) - 1);

        if (this.nbelement %4 == 0){
            quartilesTab[0] = mydata.get(nbelement/4);
        }
        else{
            double moySal   = (mydata.get((int)Math.floor(this.nbelement/4)) + mydata.get((int)Math.ceil(nbelement/4)))/2;
            quartilesTab[0] = moySal;
        }
        quartilesTab[1] = this.calculerMedianne();
        
        if (this.nbelement*3/4 == 0) {
            quartilesTab[2] = mydata.get(nbelement * 3 / 4);
        } else {
            double moySal2 = (mydata.get( (int) Math.floor(this.nbelement * 3 / 4)) + mydata.get((int)Math.ceil(this.nbelement * 3 / 4))) / 2;
            quartilesTab[2] = moySal2;
        }
        
        return quartilesTab;

    }

    public ArrayList<Double> getmydata(){
        return this.mydata;
    }

    public void setmydata(ArrayList<Double> _newVal){
        this.mydata = _newVal;
    }


}
