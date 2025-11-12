import java.util.Scanner;

public class productno {

    public static float productOfNumber(float a, float b) {
        return a * b;   // no need to cast again, both are floats
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        float a;
        float b;

        System.out.println("Enter your numbers 'a' & 'b': ");
        a = scn.nextFloat();
        b = scn.nextFloat();

        float product = productOfNumber(a, b); // store the result
        System.out.println("Product = " + product); // print the result

        scn.close(); // good practice to close the scanner
    }
}
