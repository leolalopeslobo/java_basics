import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rev_num = 0;

        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int or_num = num;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev_num = (rev_num * 10) + rem;
        }

        System.out.println("The reversed number of "+or_num+" is: "+rev_num);
    }
}
