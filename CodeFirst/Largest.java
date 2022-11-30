import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();

        // Q. Find the largest of 3 numbers
        if (a > b) {
            if(a > c) {
                System.out.println("a is the largest number");
            } else {
                System.out.println("c is the largest number");
            }
        } else if (b > c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }

        //simpler one
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("largest number is "+max);
    }
}
