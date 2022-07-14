/** p.74 */
import java.util.Scanner;

public class FingerFlashing1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("choose your hand(0:rock, 1:cieser, 3:paper) : ");
        int hand = stdIn.nextInt();

        switch (hand) {
            case 0 : System.out.println("rock"); break;
            case 1 : System.out.println("cieser"); break;
            case 2 : System.out.println("paper"); break;
        }
    }
}
