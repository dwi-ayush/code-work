import java.util.Scanner;

public class CircleStats { // Fixed spelling and meaningful name

    public static void printCircleStats(float r) {
        // Using Math.PI for better precision
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r;

        System.out.print("Enter the radius of the circle: ");
        
        // CRITICAL FIX: Use nextFloat() to handle decimal inputs like 5.5
        r = scn.nextFloat(); 

        printCircleStats(r);
        
        scn.close();
    }
}