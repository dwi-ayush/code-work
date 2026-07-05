import java.util.*;
public class inputoutput{
    public static void main(String args[]){

        // we cn not keep a function or class name string as String is also a predefined  function  in java 
        // string delaraions
        String  name = "Ayush";
        String  fullname = "Ayush dwivedi";
        String  sentence = "My name is AYush Dwivedi";

        // user input  of String variable 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter our name");
        //String name = scn.next(); // its will take input of the ingle word only (Ayush)
        String name =scn.nextLine() // it will take input of whole line including spaces and all (Ayush Dwivedi)
        System.out.println("your name is : " + name );

    }
}