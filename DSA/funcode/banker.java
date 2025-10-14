
import java.util.Scanner;

public class banker {

   static  Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

          
        // declare variable 
          
          double balance = 0;
          boolean isRunning = true;
          int choice ;

        while(isRunning){

        // display a menu
        System.out.println(" ");
        
        System.out.println(" Banking Program ");
        System.out.println(" ");
        System.out.println(" 1 --> Two show up the balance ");
        System.out.println(" 2 --> Two show up the  Deposit ");
        System.out.println(" 3 -->  Two show up the Withdraw ");
        System.out.println(" 4 --> Two  get exit ");
        System.out.println("  ");        

        // get an Process  of user choice 

        System.out.print(" enter you choise b/w 1 to 4 ");
        choice = scn.nextInt();

         switch(choice){
            case 1 ->  showbalance(balance);
            case 2 -> balance += deposit();
            case 3 ->  balance -= WITHDRAW(balance);
            case 4 -> isRunning = false ;
            default -> System.out.println("INVALID CHOICE ");  

            }
        }
        System.out.println(" tahnk you have a nice day  !");

        scn.close();
    }
    static void showbalance(double  balance){
        System.out.println("");
        System.out.print("your balance is ");
        System.out.printf("  $ %.2f", balance);
    }
    static double deposit(){
        double amount;
        System.out.print(" enter an amout you need to deposit   ");
        amount = scn.nextDouble();
        System.out.printf(" amount deposited %f \n", amount);

        if(amount < 0){
            System.out.println(" amount can not be negative");
            return 0;
        }
        else
            
        return amount;
        
    }
    static double WITHDRAW( double  balance){

        double amount;

        System.out.print("enter the amount you want to withdraw ");
        amount = scn.nextDouble();
        System.out.printf(" amount withdrawn to be  %f ", amount);

        if( amount > balance){
            System.out.println(" insuffisient funds");
            return 0;
        }
        else if( amount < 0){
            System.out.println(" amount cant not be zero ");
            return  0; 
        } else {
           return  amount;
        }

    }
}