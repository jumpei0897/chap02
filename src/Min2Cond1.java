/** p.66 */
import java.util.Scanner;

public class Min2Cond1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("int value ? ");
        int a = stdIn.nextInt();

        System.out.print("int value ? ");
        int b = stdIn.nextInt();

        int min = a < b ? a : b;
        System.out.println("lesser is " + min);
    }
}
