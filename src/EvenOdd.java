/** p.57 */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Positive value : ");
        int n = stdIn.nextInt();

        if (n > 0)
            if (n % 2 == 0)
                System.out.println("this is guusuu.");
            else
                System.out.println("this is kisuu.");
        else
            System.out.println("this is not positive number.");
    }
}
