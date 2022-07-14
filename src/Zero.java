/** p.55 */
import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("int value : ");
        int n = stdIn.nextInt();

        if(!(n != 0))
            System.out.println("This is zero.");
        else
            System.out.println("This is not zero");
    }
}
