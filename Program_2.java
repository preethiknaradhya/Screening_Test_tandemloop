import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = in.nextInt();

        System.out.print("Result: ");

        for (int p = 1; p <= x; p++) {
            System.out.print(2 * p - 1);

            if (p != x) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
