
import java.util.Random;

public  class spin{
    public static void main(String[] args) {
     Random rnd = new Random();       

     boolean spin = rnd.nextBoolean();

    if(spin){
        System.out.println("  I should go to hostel  !!! ");
    }
    else{
        System.out.println("  I should  not go to hostel  !!! ");
    }

    }
}