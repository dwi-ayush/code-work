
import java.util.Scanner;

                       // tempreature  convertor 
public class tempconverter{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.print(" enter the temperature: ");
        temp = scn.nextDouble();
        System.out.print("Convert in celsius or faherenheit?  ( C or F)");
        unit = scn.next().toUpperCase();
        
        // ternary operartor 
        newtemp = (unit.equals("c")) ? ((temp - 32)*5)/9 : (temp * (5/9))+32;
        System.out.print("temprature in " + unit +" ");
        System.out.println(newtemp);
    scn.close();
    }
}                   