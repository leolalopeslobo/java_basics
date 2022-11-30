public class SimpleLoops {
    public static void main(String[] args) {
        //simple 'if' statement
        if(true){
            System.out.println("this is true");
        }
        if(false){
            System.out.println("this is false");
        }

        int a = 25;
        if (a==25) {
            System.out.println("a is 25");
        }

        //simple 'while' loop
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count += 1;
        }

        //simple 'for' loop
        for (int cnt = 1; cnt != 5; cnt++){
            System.out.println(cnt);
        }
    }
}
