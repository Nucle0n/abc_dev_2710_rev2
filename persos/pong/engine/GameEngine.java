
import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int width,
            height;

        String WALL = "\033[48;2;120;90;60m";

        System.out.print("Taille du terrain (Width)\nEntrez un nombre entier entre 10 et 40 : ");
        width = sc.nextInt();
        height = width/2;

        System.out.println("Width = "+width+"\nHeight = "+height);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                System.out.println(WALL+".");
            }
        }

        sc.close();

    }
}
