
import java.util.Scanner;

public class AppPoint {
    public static void main(String[] args) {
        
        double x,y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une valeur pour x : ");
        x = sc.nextDouble();

        System.out.print("Entrez une valeur pour y : ");
        y = sc.nextDouble();

        Point point = new Point(x,y);
        point.displayCoord();

        Point point1 = new Point(x,y);
        Point symOrdo = point1.symOrdonnees();
        symOrdo.displayCoord();

        Point point2 = new Point(x,y);
        Point symAbs = point2.symAbscisse();
        symAbs.displayCoord();

        Point point3 = new Point(x,y);
        Point symOrg = point3.symOrigine();
        symOrg.displayCoord();

        Point point4 = new Point();
        Point permut = point4.permuter();
        permut.displayCoord();

        sc.close();

    }
    
}
