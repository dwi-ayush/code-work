import java.util.Scanner;

public class circle{
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

     System.out.print("enter the radius of the circle ");
     double r = scn.nextDouble();
    
     double cir = 2 * Math.PI* r;
     double area = Math.PI* Math.pow(r, 2);

     System.out.println("circumfrence of the circle is " + cir);
     System.out.println(" area of the circle is " + area);
     
     scn.close();
    
    }
}