import java.util.ArrayList;
import java.util.Comparator;

public class Methodes {
    
    public static ArrayList salairesListe(){

        ArrayList<Double> salaires = new ArrayList<Double>();

        salaires.add(2100.0);
        int size = salaires.size();
        for (int i = size ; i < size+14 ; i++) 
        {
            salaires.add(salaires.get(i-1) + 50);
        }

        double[] tmp = {2900, 2950, 2950, 3000, 3000, 3000, 3000,3100, 3100, 3150, 3150, 3200, 3200, 3250, 3250, 3300, 3300, 3350, 3350, 3400, 3400, 3450, 3500, 3550, 3600, 3650, 3700, 3750, 3800, 3850, 3900, 3900, 3950, 3950, 4000, 4100};
        for (double d : tmp) {
            salaires.add(d);            
        }
        
        size = salaires.size();
        for (int i = size; i < size + 28; i++) 
        {
            salaires.add(salaires.get(i-1) + 50);
        }

        salaires.add(5500.0);
        salaires.add(5600.0);

        size = salaires.size();
        
        for (int i = size; i < size + 9; i++) 
        {
            salaires.add(salaires.get(i-1) + 100);
        }
        
        size = salaires.size();

        for (int i = size; i < size + 3; i++) 
        {
            salaires.add(salaires.get(i-1) + 200);
        }

        size = salaires.size();
        
        for (int i = size; i < size + 4; i++) 
        {
            salaires.add(salaires.get(i-1) + 300);
        }

        size = salaires.size();

        for (int i = size; i < size + 3; i++) 
        {
            salaires.add(salaires.get(i-1) + 400);
        }
        
        // salaires.sort(Comparator.naturalOrder());
        salaires.sort(Comparator.reverseOrder());

        return salaires;
    }

    public static double moyenne(ArrayList<Double> _liste){
        
        double total = 0;

        // avec fori
        for (int i = 0; i < _liste.size(); i++) {
            total += _liste.get(i);
        }
        return total/_liste.size();

        // avec foreach (Simon)
        // for (double element : liste) {
        //     total += element;
        // }
        // return total/liste.size();
    }

    public static double mediane(ArrayList<Double> _liste){
        
        int temps = 0;
        double res = 0.0;

        if (_liste.size() % 2 == 0)
            {
                temps = (_liste.size() / 2);
                return (_liste.get(temps - 1) + _liste.get(temps)) / 2;
            }
            else
            {
                temps = ((_liste.size() - 1 ) / 2 );
                return _liste.get(temps);
            }
    }

    public static double ecart(ArrayList<Double> _liste){
        
        double tmp = 0.0;
        double res = 0.0;

        for (double e : _liste){
            tmp += Math.pow((e - Methodes.moyenne(_liste)),2);            
        }
        res = Math.sqrt(tmp/100);
        return res;
    }

    /**
     * 
     * Quartiles
     * @param _liste
     * @return double
     */
    public static double q1(ArrayList<Double> _liste){
        double q1 = Methodes.moyenne(_liste) - 0.674 * Methodes.ecart(_liste);
        return q1;
    }

    public static double q3(ArrayList<Double> _liste){
        double q3 = Methodes.moyenne(_liste) + 0.674 * Methodes.ecart(_liste);
        return q3;
    }

}
