import java.util.Random;

public class RANDOMDOUBLE {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        double number1;
        double number2;

        // Random double between 0.0 and 1.0
        number1 = rnd.nextDouble();

        // Random double between 1.0 and 7.0
        number2 = 1 + rnd.nextDouble() * (7 - 1);

        System.out.println(number1);
        System.out.println(number2);
    }
}
