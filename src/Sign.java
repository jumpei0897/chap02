/** p.56 */
import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("int value : ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("this value is positive.");
        else if (n < 0)
            System.out.println("this value is negative.");
        else
            System.out.println("this value is zero.");
    }
}
