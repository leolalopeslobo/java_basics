public class Conditionals {
    public static void main(String[] args) {
         /*
        Syntax of 'if' statements:
        if (boolean expression T or F) {
            // body
         } else {
            // do this
         }
         */

        int salary = 25700;
        if (salary > 10000) {
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println(salary);


        //multiple if-else statements
        int pay = 20500;
        if (pay > 10000) {
            pay += 2000;
        } else if (pay > 20000) {
            pay += 3000;
        }
        else {
            pay += 1000;
        }
    }
}
