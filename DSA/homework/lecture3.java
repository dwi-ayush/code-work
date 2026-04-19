// lecture 3
/* problem 1 
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/
import java.util.Scanner;

public class lecture3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
         int i ;
         int a;
         int b;
         System.out.println("You can perform the operations as such : ");
         System.out.println("\n 1 : + (Addition) a + b \n 2 : - (Subtraction) a - b \n 3 : * (Multiplication) a * b \n 4 : / (Division) a / b \n 5 : % (Modulo or remainder) a % b");
         System.out.print("Enter the number according to operation : \n");
         i = scn.nextInt();
         System.out.println(" Enter the Value of a and b respectively! ");
         a = scn.nextInt();
         b = scn.nextInt();

         switch(i){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default : System.out.println(" Invalid Output! ");

         }

    }
}

