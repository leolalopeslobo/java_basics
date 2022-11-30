import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the nth find fibonacci index: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        if (n == 0) {
            System.out.println("Fibonacci value is "+a);
        } else if (n == 1) {
            System.out.println("Fibonacci value is "+b);
        } else {
            while (count <= n) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            System.out.println("Fibonacci value is "+b);
        }
    }
}
