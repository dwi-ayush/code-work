
import java.util.Scanner;

public class calccompund{
    public static void main(String[] args) {
        
     Scanner scn = new Scanner(System.in);
     double priciple;
     double rate ;
     int timeCoumpounded;
     int year;
     double amount;
     
     System.out.print(" Enter the principle amount: ");
     priciple = scn.nextDouble();
     System.out.print(" Enter the interst rate ( in %): ");
     rate = scn.nextDouble()/100; // we are divind it by 100 as user 3 so we get.03
     System.out.print(" Enter the  # of times  compound per year : ");
     timeCoumpounded = scn.nextInt();
     System.out.print(" Enter the  # of year: ");
     year = scn.nextInt();

     amount = priciple * Math.pow(1+(rate/timeCoumpounded), (timeCoumpounded*year));

     System.out.printf(" The amount after %d year is %.2f \n ", year , amount );

        
        
    scn.close();
    }
}