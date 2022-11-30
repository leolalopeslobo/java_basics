import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Simple C to F temperature converter");
        System.out.print("Please enter temp in C: ");
        float tempC = ip.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temp in F: "+tempF);
    }
}
