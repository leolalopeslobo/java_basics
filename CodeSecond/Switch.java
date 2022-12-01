import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select fruit for if statement: ");
        String fruit_if = in.next();

        if (fruit_if.equals("mango")){
            System.out.println("King of Fruits");
        }

        if (fruit_if.equals("apple")) {
            System.out.println("A Sweet Fruit");
        }

        //Instead of solving the above questions by using 'if' statements
        //Use 'switch' statements
        System.out.print("Select fruit for switch statement: ");
        String fruit_switch = in.next();
        switch (fruit_switch){
            case "banana":
                System.out.println("You selected 'banana'");
                break;
            case "watermelon":
                System.out.println("You selected 'watermelon'");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

        //Enhanced switch statement
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid entry");
        }


        //Old version
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }

        //Enhanced version
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}