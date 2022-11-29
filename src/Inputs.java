import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your PR input: ");
        int rn = in.nextInt(); //takes the integer input
        System.out.println("Your registration number is "+rn);


        int a = 562_000_000; //five hundred and sixty-two million
        System.out.println(a);

        String name = in.nextLine();
        System.out.println(name);

        float marks = in.nextFloat();
        System.out.println(marks);
    }
}
