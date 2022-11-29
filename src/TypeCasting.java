import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Type Conversion
        float num = in.nextFloat();
        System.out.println(num);

        int val = 'L';
        System.out.println(val);

        //Type Casting or Narrowing Conversion
        int numCast = (int)(53.78f);
        System.out.println(numCast);

        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1


        //Automatic type promotions in expressions
        byte p = 50;
        byte e = 40;
        byte i = 100;
        int s = p * e / i;
        System.out.println(s);


        //Unicode
        System.out.println("नमस्ते");





        //A complete example
        byte o = 42;
        char c = 'a';
        short y = 1024;
        int x = 50000;
        float f =5.67f;
        double d = 0.1234;
        double result = (f * o) + (x / c) - (d - y);
        // float + integer - double = double
        System.out.println((f * o) + " " + (x / c) + " " + (d - y));
        System.out.println(result);
    }
}
