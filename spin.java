// do at your own risk as it is all on the Random class 

import java.util.Random;

public class spin {

    public static void main(String[] args) {

        Random rnd = new Random();

        boolean spin = rnd.nextBoolean();

        if (spin) {
            System.out.println("work");
        } 
        else {
            System.out.println("do not work");
        }

    }
}

