
import java.util.Scanner;

public class weightconverter{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;
         System.out.println(" WELCOME TO THE WEIGHT CONVERTER PROGRAM BY DWI_AYUSH ");
         System.out.println(" Choice 1 for convert lbs to kg ");
         System.out.println(" Choice 1 for convert kg to lbs ");
         System.out.print("Enter the choice: ");
         choice = scn.nextInt();

         if(choice ==   1){
            System.out.print("eneter the weight in lbs ");
            weight = scn.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("the new weight is %.2f",newweight); 
         }
         else if(choice ==  2 ){
            System.out.print("eneter the weight in kgs ");
            weight = scn.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("the new weight is %.2f",newweight);
            
         }
         else {
            System.out.println("not a valid choice");
         }


    }
}