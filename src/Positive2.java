/** p.52 */
import java.util.Scanner;

public class Positive2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("int value : ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("this value is positive.");
        else
            System.out.println("this value is null or negative.");
    }
}
