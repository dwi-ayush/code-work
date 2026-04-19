
import java.util.Random;

public  class spin{
    public static void main(String[] args) {
     Random rnd = new Random();       

     boolean spin = rnd.nextBoolean();

    if(spin){
        System.out.println("  I should take mobile phone   !!! ");
    }
    else{
        System.out.println("  I should  not take mobiloe phone u will  clear back   !!! ");
    }

    }
}