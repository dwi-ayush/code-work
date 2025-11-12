
import java.util.Scanner;

public class basic{
    public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);

        String name;
        int age;
        System.out.println("eneter your name for the birthaday song");
        name = scn.nextLine();
        System.out.println("enter your age ");
        age = scn.nextInt();

        happyBirthday(name, age);


        System.out.println(" ");

    // using method directly without declariont along with print statment 

        double number;
        System.out.println("enter the number for the square ");
        number = scn.nextInt(); 

        number = sqaure(number);
        System.out.println(number);

        System.out.println(" ");


    // using method directly without declariont along with print statment 

        double cubenumber ;
        System.out.println("enter up the number ");
        cubenumber = scn.nextDouble();

        System.out.println(cube(cubenumber));

        System.out.println(" ");

    // method use in string 

    String first;
    scn.nextLine();

    System.out.println("enter your first name ");  
    first = scn.nextLine();

    String last ;
    System.out.println(" enter your second name "); 
    last = scn.nextLine();

    System.out.println("hello dear " + getFullname(first, last));

     System.out.println(" ");

    // methods in boolean 

    int  agecheck;
    System.out.println("enter your age ");
    agecheck = scn.nextInt();

    if(agecheck(agecheck)){
        System.out.println("i will fuck you");
    } else{
        System.out.println("suck my dick");
    }



    }
    // create a method 

    static void happyBirthday(String name, int age ){
        System.out.println("happy birthday to you");
        System.out.printf("happ bithday dear %s!\n", name);
        System.out.printf(" you are %d year old!\n", age);
        System.out.println("happy birthday to you ");
        
    }
    static double sqaure(double number){
        return number * number;
    }
    static  double cube(double cubenumber){
        return cubenumber*cubenumber*cubenumber;
    }
    static String getFullname(String first, String last){
        return first + " " + last;
    }
    static boolean agecheck(int age){
        if(age >= 18){
            return true;
        }else{
            return  false;
        }
    }
}


/* 
 -> all functions in java are stored in stack memory form.{ matlb wo book pattern ek ke upar ek wala seen }
 new memory is cerated when it is called by main function and end up when it retrun up the value
 ->  we camelcase to name function {camelcase ex=(printMyNmae) starting word captial and other small }
*/