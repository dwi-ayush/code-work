import java.util.Scanner;

public class Age {
    public static void eligibleForVote(int age) {
        
        // 1. Check for invalid input (negative age)
        if (age < 0) {
            System.out.println("Invalid Input: Age cannot be negative.");
        } 
        // 2. Check for eligibility
        else if (age > 18) {
            System.out.println("You are eligible for voting.");
        } 
        // 3. Handle the remaining cases (0 to 18)
        else {
            System.out.println("You are not eligible for voting yet.");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age;
        
        System.out.print("Enter your age: "); 
         age = scn.nextInt();
        
        
        eligibleForVote(age);
        
        scn.close();
    }
}