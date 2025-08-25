import java.util.Random;
public class RANDOMBOOLEAN  {
    public static void main(String[] args) {
        Random rnd = new Random();       
        
        boolean ishead;

        ishead = rnd.nextBoolean();

        //System.out.println( ishead);
    if(ishead){ // instead of printing true or false i have printed that you are aloowed or not 
        System.out.println("you are allowed");
    }else{
        System.out.println(" you are not allowed");

    }
    
    }

}