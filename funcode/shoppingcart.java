
import java.util.Scanner;

// shoping cart program 
public class shoppingcart{
 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     String item;
     double price;
     int quantity;
     char currency = '$';
     double total;
     System.out.print("what item would you like to buy?:");
      item = scn.nextLine();
     System.out.print(" what is the price of the item?:");
     price = scn.nextDouble();
     System.out.print("How many item would you like to buy?: ");
     quantity = scn.nextInt();
     total=price*quantity;
     System.out.println("\n You have bought "+quantity+" "+item+" \s");
     System.out.println("your total amount is "+currency+total);
    scn.close();
 }
}