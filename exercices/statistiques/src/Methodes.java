import java.util.ArrayList;

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
        
        salaires.sort(null);

        return salaires;
    }

    public static double moyenne(ArrayList<Double> _salaires){
        
        double total = 0;

        // avec fori
        for (int i = 0; i < _salaires.size(); i++) {
            total += _salaires.get(i);
        }
        return total/_salaires.size();

        // avec foreach (Simon)
        // for (double element : liste) {
        //     total += element;
        // }
        // return total/liste.size();
    }

    public static double mediane(ArrayList<Double> _salaires){
        
        double res;

        if (_salaires.size() % 2 == 0)
            {
                res = (_salaires.size() / 2);
                return (double)(_salaires.get(res) + _salaires.get(res + 1)) / 2;
            }
            else
            {
                res = (double)(( _salaires.size() - 1 ) / 2 ) + 1;
                return (double)_salaires.get(res);
            }
    }

    public static double ecart(){
        
    }

    public static double quartile(){
        
    }

}
