// run this code and find out the out of the code 
/*public class lecture4 {
    public static void main(String[] args) {
     for( ; ; ){
      System.out.println("Apna College");
     }
    }
}*/
// answer is in finite loop

                                                               // question 2 

// problem is to print all natural number till user input value n 

/*import java.util.Scanner;

public class lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i += 2){
            System.out.print(i + " ");
        }
    }
}*/



                                                               // question 3
/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/
import java.util.Scanner;
 public class lecture4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks or 0 to exit: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the student's marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered.");
                }
            }
        } while (choice != 0);

        System.out.println("Exiting the program. Thank you!");
    }
 }
