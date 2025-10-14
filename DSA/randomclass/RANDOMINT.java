
import java.util.Random;

public class RANDOMINT {
    public static void main(String[] args) {
        
        Random rnd = new Random();
         int number1;
         
         int number2;

         number1 = rnd.nextInt(); // random number from - 2 billion to 2 billion

         number2 = rnd.nextInt(24 , 46);// it will give vaule from 1 to 6 not 7

         System.out.println(number1);  


         System.out.println(number2);

   
    }

}