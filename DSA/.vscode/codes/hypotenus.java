
import java.util.Scanner;

public class  hypotenus{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print(" enter the heightvof the rectangle ");
        a = scn.nextDouble();
        System.out.print(" enter the height of the rectangle  ");
        b = scn.nextDouble();

        c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(" height of the trinagle is "+ a);
        System.out.println(" breath of the trinagle is "+ b);

        System.out.println(" hypotenus of the triangle is " + c);
    }

}