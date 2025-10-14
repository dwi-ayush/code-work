
import java.util.Scanner;

public class quiz{
    public static void main(String[] args) {
        
        // JAVA QUIZ GAME 

     String[] question = {"what is the main function of a router?",
                           "which part of computer is considerd as brain?",
                           "in which year facebook was being launched ?",
                           " who is known as the father of the computer?",
                           " What was the first programing langauge?",};
    
    
    String[][] options = {{"1.stroronf file ","2. Encrypying data ","3.Directing Data Transfer ","4.Maning Passwords "},
                         {"1. CPU ","2. MOUSE ","3.RAM ","4.GPU  "},
                         {"1. 2000 ","2.2004 ","3.2006 ","4.2008  "},
                         {"1.sTEVE JOBS ","2.AYuSH dWIVEDI ","3. Bill Gates ","4. Charles Babage "},
                         {"1.JAVA ","2.C ","3.FORTRAN ","4.C++  "}};  
     
    int[] ANSWERS ={3 ,1,2,4,3};                
    int score= 0;
    int guess = 0;
    Scanner scn = new Scanner(System.in);

    System.out.println("  WELCOME JAVA QUIZ GAME ");

    for(int i = 0 ; i < question.length; i ++ ){
        System.out.println(question[i]);
      
        for(String option : options[i]){
            System.out.println(option);
        }
            System.out.print("enter your guess");
            guess = scn.nextInt();

        if( guess == ANSWERS[i]){
            System.out.println("");
            System.out.println(" CORRECT! ");
            System.out.println("");
            score++;
         }
         else{
            System.out.println("");
            System.out.println(" WROMG! ");
            System.out.println(""); 
         }
    }


    System.out.println("yoour final answer is:" + score+ "out of"+ question.length);

    scn.close();
    }

}