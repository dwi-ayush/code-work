import java.util.*;


public class Compare {
   public static void main(String args[]) {
       String name1 = "Tony";
       String name2 = "Tony";

    // correct way to use it 
    
    
    /*int result = name1.compareTo(name2);
        System.out.println(result);*/

    /*-> in this their are 3 types of condition 
    1-> -ve value  if str 1 is smaller than str 2 
    2-> 0 if equal 
    3-> +ve value  if str1 is larger than str 2 
    
    */


       if(name1.equals(name2)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(name1 == name2) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
      
   }
}

