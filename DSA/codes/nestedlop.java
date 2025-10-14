import java.util.Scanner;
public class nestedlop{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean isStudent;
        boolean isSenior ;
        double price;
        System.out.print("Are You Student (true/false): ");
        isStudent = scn.nextBoolean();
        System.out.print("Are You Senior (true/false): ");
        isSenior = scn.nextBoolean();
        System.out.print("Enter the price: ");
        price = scn.nextDouble();
        if(isStudent){
            if(isSenior){
                System.out.println("you get SENIOR discount of 20%");
                System.out.println("you get  STUDENT discount of 10%");
                price *= 0.7;
                System.out.printf("you total amount is %.2f", price);
           }
         else{
             System.out.println(" You get a student discount of 10%");
             price *= 0.9;
             System.out.printf("you total amount is %.2f", price);
            }
        }
        else {
            if(isSenior){
             System.out.println("you get SENIOR discount of 20%");
             price *= 0.8;
             System.out.printf("you total amount is %.2f", price);
            }
        else{
            price *= 1;
        System.out.printf("you total amount is %.2f", price);
            }
            }
scn.close();
}
}