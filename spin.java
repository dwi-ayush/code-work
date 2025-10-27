
import java.util.Random;

public  class spin{
    public static void main(String[] args) {
     Random rnd = new Random();       

     boolean spin = rnd.nextBoolean();

    if(spin){
        System.out.println("  I should get ready for the diwali  !!! ");
    }
    else{
        System.out.println("  I should  not get ready for the diwali  !!! ");
    }

    }
}