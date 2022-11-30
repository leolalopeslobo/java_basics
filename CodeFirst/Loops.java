import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q. print "hello world" 5 times
        /*
        --- for loops ---
        Syntax of 'for' loops:
        for (initialization; condition; increment/decrement) {
            // body
         */
        for (int num = 1; num <= 5; num+=1){
            System.out.println(num);
        }

        // Q. Print numbers from 1 to n (where n value is taken from user)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int i = input.nextInt();
        for (int j=1; j<=i; j++){
            System.out.print(j+" ");
        }

        System.out.println();

        /*
        --- while loops ---
        Syntax of 'while' loops:
        while (condition) {
            // body
        }
        */

        int num = 1;
        while(num <= 5){
            System.out.print(num+" ");
            num+=1;
        }


        /*
        --- do-while loop ---
        Syntax of 'do-while' loop
        do {
            // body
        } while (condition)
         */

        System.out.println();
        int n = 1;
        do {
            System.out.println(n);
            n+=1;
        } while (n <= 6);
    }
}
