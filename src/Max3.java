/** p.68 */
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("value a ? ");
        int a = stdIn.nextInt();
        System.out.print("value b ? ");
        int b = stdIn.nextInt();
        System.out.print("value c ? ");
        int c = stdIn.nextInt();

        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        System.out.println("max number is " + max);
    }
}
