
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a;//num 1
        double b;// num2
        char z;// operators 
        double x = 0;//result
        boolean validoperation = true;


        System.out.print("enter the first value: ");
        a = scn.nextDouble();
        System.out.print("enter the second value: ");
        b = scn.nextDouble();
        System.out.print("enter the operators {*,/,+,-,%,^}: ");
        z = scn.next().charAt(0);

        switch(z){
            case'+' -> x = a+b;
            case'-' -> x = a-b;
            case'*' -> x = a*b;
            case'/' -> {
                if( b == 0){
                    System.out.println("cannot be divide by zero");
                    validoperation = false;
                }
                else{
                    x = a/b;
                }
            }
            case'%' -> x = a%b;
            case'^' -> x = Math.pow(a,b);
            default -> {
                System.out.println("invalid opreator");
                validoperation = false;
            }
        
        }if (validoperation){
        System.out.println(x);
        }
        // we will not use else statement bucz we are using default case ip side v
    }
}