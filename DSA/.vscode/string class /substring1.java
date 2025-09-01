
import java.util.Scanner;

// substring() = a method to extract a portion of string 
//  (stringname).substring(start , end)

public class  substring1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("eneter your email");
        String  email = scn.nextLine();
         
        
        //String username = email.substring(0 , 17);
        // apart from this we can also directectly use index method we will write
        String username = email.substring(0 , email.indexOf("@")); 
        //int index = email.indexOf("8");
        //String domian = email.substring(16 , 21);
        String domian = email.substring(email.indexOf("@") + 1); 

        System.out.println(username);
        System.out.println(domian );

    }
}
