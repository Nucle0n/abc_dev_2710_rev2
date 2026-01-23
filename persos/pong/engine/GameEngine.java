
import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int width,
            height,
            count = 0;

        String WALL_COLOR = "\033[48;2;120;90;60m";
        String RESET = "\033[0m";
        String WALL = WALL_COLOR+"X"+RESET;
        String CONCLUSION = "\npoint faible ? trop fort.💥";

        System.out.print("Taille du terrain (Width)\nEntrez un nombre entier entre 5 et 15 : ");
        height = sc.nextInt();
        width = height*2;

        System.out.println("Width = "+width+"\nHeight = "+height);

        //bad: pas adapté au terminal: ici, tu parcours la largeur d'abord, puis chaque ligne
        for (int x = 0; x < width; x++) { //parcours largeur
            for (int y = 0; y < height; y++) { //parcours hauteur
                count++;
                System.out.println(WALL+count);
            }
        }


        System.out.println("\n\n\t--ekrebs's:--");
        //ici je parcours chaque ligne d'abord (height)
            //puis la largeur de la ligne (width)
        count = 0;
        for (int x = 0; x < height ; x++) { //pour chaque ligne de la hauteur
            count++;
            System.out.printf("ligne %3d: ",count);
            for (int y = 0; y < width; y++) { //pour chaque colonne de la largeur
                System.out.print(WALL);
            }
            System.out.println();
        }
        System.out.println(CONCLUSION);

        sc.close();

    }
}
