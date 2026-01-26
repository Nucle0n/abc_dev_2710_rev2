
import java.util.Scanner;

public class AppCompte {

    public static void main(String[] args) {
        
        // Declare variables
        Scanner sc = new Scanner(System.in);
        
        String menu1;

        boolean haveAka = false;


        // Begin user interactions

        System.out.print("Possèdez vous un compte ?\n1 - \033[1;4mO\033[0mui\n2 - \033[1;4mN\033[0mon\n");
        while (true) {
        menu1 = sc.nextLine().toLowerCase().trim();
            if (menu1.equalsIgnoreCase("2") || "n"){
                haveAka = false;
            }
        }

        sc.close();
    }
}
