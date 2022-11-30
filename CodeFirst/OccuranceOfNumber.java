import java.util.Scanner;

public class OccuranceOfNumber {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("1385757879");
        int num = 1385757879;
        System.out.print("enter a number from 1 to 9: ");
        int occ_num = in.nextInt();
        int occ = 0;

        while(num > 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem == occ_num) {
                occ+=1;
            }
        }
        System.out.println(occ_num+" is repeated "+occ+" time(s)");
    }
}
