import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int empID = in.nextInt();
        System.out.print("Enter department: ");
        String dept = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sandra Smith");
            case 2 -> System.out.println("Luke James");
            case 3 -> {
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department enter");
                }
            }
            default -> System.out.println("Enter correct employee ID");
        }
    }
}
