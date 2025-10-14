import java.util.Scanner;
public class  DETAILS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" enter your name : ");
        String name = scn.nextLine();
        System.out.println(" enter your age : ");  
        int age  = scn.nextInt();
        System.out.println(" HAVE YOU COMPLETED YOUR MASTER'S (true or false): ");
        boolean isstudent = scn.nextBoolean();

        //group 1
        if(name.isEmpty()){
            System.out.println("you have not enterred up the name ");
        }
        else{
            System.out.println("hello " + name );
        }

        //group 2
        if(0>age){
            System.out.println("not born ");
        }
        else if(10 >=  age && age >= 0){
            System.out.println(" you are children ");
        }
        else if(18 >= age  && age >= 10 )
        {
            System.out.println(" you are tenagger ");
        }
        else if(40 >= age && age >=  18){
            System.out.println(" you are  adult ");
        }
        else if(65 >= age && age >= 40){
            System.out.println(" you are senior ");
        }
        else if(age >= 65){
            System.out.println(" you are OLD ");
        }

    // group 3
    if(isstudent){
        System.out.println(" you are NOT A student ");
    }
    else{
        System.out.println(" you are A student ");
    }
    }
}        