
import java.util.Scanner;


public class sumno{

    public static int  sumOfNumber ( float a ,float b) 
    {
        
        System.out.println(" sum of the two number is " + (a+b));
        
        return 0 ;
        
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);


        float a ;
        float b;

        System.out.println("enter your number  'a' & 'b' ");
        a = scn.nextFloat();
        b = scn.nextFloat();
        
        sumOfNumber(a, b);


    }
}