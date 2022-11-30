import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = "butter";
        System.out.println(word.charAt(1)); //printing the char present at the index given

        char ch = in.next().trim().charAt(0); //charAt() returns a 'cahr' datatype
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("char "+ch+" is lowercase");
        } else {
            System.out.println("char "+ch+" is uppercase");
        }
    }
}
