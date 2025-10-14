
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


/*to  get the length of a strimg we use 
   int (variablename) = (stringname).length();
and to check for the charcater value the what value is presnt at that index we use 
   char (variablename) =(stringname).charAt(indexvalue)
to find up the index value we will use 
   int index = (stringname).indexOf("(lettr name )")
// it will also give a index value to pace also 

to get al value at upper case we will use 
  (stringname) =  (stringname).toUpperCase();
to get al value at Lower case we will use 
  (stringname) =  (stringname).LowerCase();
to get al value at trim up { removing extra space } we will use 
  (stringname) =  (stringname).trim();
to repace value with in a string we will use 
   (stringname) =  (stringname).trim();
to repace value with in a string by aother chracter we use 
   (stringname) =  (stringname).replace(" (first charcheter) ", " (second charcater)") 
to check weathr it s empty or not we will use 
     (stringname).isEmpty()
  it will give us a boolean value or we can use it in any loop value 
to check weather the value contain something we will use 
    (stringname).contains(" ( value) ") // it will give bollean value or can be used in loop 
  it can also be use for space */