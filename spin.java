
import java.util.Random;

public  class spin{
    public static void main(String[] args) {
     Random rnd = new Random();       

     boolean spin = rnd.nextBoolean();

    if(spin){
        System.out.println("   ");
    }
    else if (spin) {
        System.out.println("    ");
    }
    
    }
}