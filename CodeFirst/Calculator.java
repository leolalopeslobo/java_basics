import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take user from user till user does not press X or x
        int ans = 0;

        System.out.println("To stop press x or X");
        while(true) {
            //take the operator
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input numbers
                System.out.print("Enter num1 ");
                int num1 = in.nextInt();
                System.out.print("Enter num2 ");
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0) {
                        ans = num1 + num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println("Output is: "+ans);
        }
    }
}
