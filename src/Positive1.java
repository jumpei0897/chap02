/** p.50 */
import java.util.Scanner;

public class Positive1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("int value : ");
        int n = stdIn.nextInt();

        if (n > 0) 
            System.out.println("It is positive.");
    }
}
