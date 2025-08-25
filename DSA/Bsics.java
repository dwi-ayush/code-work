                    // PROGRAM 1 
// print hello world 
/*public class Bsics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/

                                    // program 2

//print a tringale of 5 star without using  5 line by using \n
/*public class Bsics{
    public static void main(String[] args) {
        System.out.println("*\n**\n***\n****\n*****");
    }
}
*/
                                    //program 3
// print z in java 
/*public class Bsics {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println("*");
        System.out.println("*****");

    }
}*/
                                  // program 4
// program for arthmatic of a number 
/*public class Bsics{
    public static void main(String[] args) {
     int x = 15;
     int y = 10;
     int sum = x+y;   
     int prd = x*y;
     int div1 = x/y;
     int div2 = y/x;
     int mod = x%y;
//System.out.println("sum");{it will on give (sum) written in alphabetbcz what we write in ("") it print as is is give so we will use another statment line}
     System.out.println("sum of " + x + " and " + y + " is "+sum);
     System.out.println(" product of " + x + " and " + y + " is "+prd);
     System.out.println("divide of  " + x + " and " + y + " is "+div1);
     System.out.println("divide  of " + y + " and " + x + " is "+div2);
     System.out.println("module of " + x + " and " + y + " is "+mod);    
//expression work using bod mas     
     int expression1 = x*y / x+y;
     System.out.println("answer of the expression1 is " + expression1);
// out we get is 20 bcz of not using bracet and aswer is wrong according to maths      
     int expression2 = (x*y) / (x+y);
     System.out.println("answer of the expression2 is " + expression2);
     }
}*/
                              //program 5
//odd and even program 
 /*public class Bsics{
    public static void main(String[] args) {
    int x = 1316;
    if(x%2 == 0)
    {
        System.out.println(x + " is a even number ");
    }  
    else 
    {
        System.out.println(x + " is a odd number");
    }
    System.out.println("so the word hader along with smarter srategy");
    }
 }*/
                             // program 6
// nested if and else loop prgram 
/*public class Bsics
{
    public static void main(String[] args) 
    {
    int n1 =2546;
    int n2 = 545;
    if( n1 == n2)
    {
        System.out.println(n1 + " is a equal to " + n2);
    }  
    else 
    {
        if(n1>n2)
        {
            System.out.println(n1 + " is larger than" + n2);
        }
        else 
        {
            System.out.println(n1 + "is smaller than" + n2);
        }
    }
 }  
}*/
                                //program 7
// grading system problem
/*public class Bsics{
    public static void main(String[] args) {
        int marks = 5;
         System.out.println("Grade of student is " + marks);
         if( marks > 90)
         {
            System.out.println("student is passed with 1st division");
         }
         else if(marks < 90 && marks > 70) // withgout and opreater we can not do comparision
         {
            System.out.println("student is passed with 2nd division");
         }
         else if( marks > 40)
         {
            System.out.println(" stduent is passed with 3rd division");
         }
         else 
         {
            System.out.println("student is failed he/she has to apppear for re-exam");
         }
         System.out.println("wish best for the student future");
    }
}*/
                                      // program 8
//loop statment                                                                       
// printing number from1 to 9 using while loop
/*public class Bsics
{
    public static void main(String[] args) 
    {
        int i =1; // {intisilaizationtask}
        while( i <= 9 ) // {evalution task}
        {
            System.out.println(i);
            i++; //or //i = i+1;  //{implementation task}
            
        }
    System.out.println("program executed by while loop");    
    }
}*/
                                     // program 9
// doing same profram with usinf for loop 
/*public class Bsics{
    public static void main(String[] args) {
//for(intilization ; evaluation ; implementation)
     for( int i = 1  ; i <= 9 ; i++){
        System.out.println(i);
     }
     System.out.println("program exectuded by for loop ");
    }
}*/
                                  // program 10
// input from user and the sum of the number 

/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        // scanner ka s hamesa capital rahega small me nahi rakhenge ise kabhi bhi warna error aayegi
        //yeah ek input class banai hai jisme (system.in) ka kaa hai keyboard read karke input lena 
        System.out.println("enetr the first number");
        //int a =sc.nextInt();
        float a =sc.nextFloat();
        System.out.println("enetr the second number");
        //int b =sc.nextInt();
        float b =sc.nextFloat();
        //int sum = (a+b);
        float sum = (a+b);
        System.out.println("Sum of the number is " + sum );
    
    }
}*/
                                 //program 11
/* in this program  we will be given  input by user and we have to and check that weather number is prime 
is or not along with it user   hame yeah bhi batayega ki kitne inouts hame lene hai*/
/*import java.util.Scanner; 
public class Bsics{
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to check: ");
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is a Prime Number.");
            } else {
                System.out.println(n + " is NOT a Prime Number.");
            }
        }

        scn.close();
    }
}*/
// this programa consume a  lot of time that means it has high time complexcity which is O(n^2) which is worst 
                                     // program 12
//the same program but my method and this has less time complexcity than that which is O(n) which is good                                      
/*import java.util.Scanner; 
public class Bsics{
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to check: ");
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 1; div <= 9; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is a Prime Number.");
            } else {
                System.out.println(n + " is NOT a Prime Number.");
            }
        }

        scn.close();
    }
}*/
                                            // program 13
// same by using the square root loop and {break statment}
// as complecity of this program is O(sqrt(n)) which is best
/*import java.util.Scanner; 
public class Bsics{
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to check: ");
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n + " is a Prime Number.");
            } else {
                System.out.println(n + " is NOT a Prime Number.");
            }
        }

        scn.close();
    }
}*/                                           
                                          //program 14
// print all prime number till user given value                                           
/*import java.util.Scanner; 
public class Bsics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number till where you want the prime numbers: ");
        int t = scn.nextInt();

        for (int n = 2; n <= t; n++) {  // start from 2, as 1 is not prime
            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {  // prime numbers have exactly 2 divisors: 1 and itself
                System.out.println(n);
            }
        }
    }
}*/
                                        // program 15 
// print prime number btween 2 nuber given by user
/*import java.util.Scanner; 
public class Bsics {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the lowest  number ");
      int low = scn.nextInt();
      System.out.println("Enter the highest  number  ");  
      int high = scn.nextInt();
      System.out.println("\n");
      for(int n = low ; n <=high ; n++ ){
        int count = 0;
        // try to divide n and incerase the count 
        for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
        if(count == 0){
            System.out.println(n);
        }
      }
    }
}*/                                    
                                      // program 16
// fibbonaci series 
  /*  import java.util.Scanner;
    public class Bsics{
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = scn.nextInt();
      int a = 0;
      int b = 1;
      for(int i = 0; i <= n; i++)
      {
        System.err.println(a);
        int c = a+b;
        a = b;
        b = c;

      }
    }
}*/
                                        // program 17      
// count the number of  digit given by th user and tell how ma y digits are present
// counting digits in a number :-
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n =scn.nextInt();
        int digit = 0;
        while(n != 0){
            n = n / 10;
            digit++;
        }
        System.out.println(digit);
    }
}*/ 
                                        // program 18
// fibonnaci number 
/*import java.util.Scanner;
public class Bsics
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTEWR THE NUMBER");
        int n = scn.nextInt();
        
        if(n == 0){
            System.out.println("Fibonacci number at position 0 is:" + n);
        }
        else if( n == 1){
            System.out.println("Fibonacci number at position 1 is" + n);
        }
        int a = 0 , b = 1;
        int c ;// the final fibonacci number which will be priented 
        for(int i = 2 ; i <= n ; i++){
            c = a + b;
            a = b;
            b = c ;
        }
        System.out.println("Fibonacci number at position " + n + " is  "  + b);
    }
} */
                                      // program 19
// represnt the number of digit seprating 
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" ENTER THE NUMBER");
        int n = scn.nextInt();
        int nod = 0;
        int temp = n;
        while(temp != 0){
        temp = temp / 10;
        nod ++;    
        }
        int div = (int)Math.pow(10 , nod-1);
        while(div != 0){
        int q = (n / div) ;
        System.out.println(q);
        n = n % div ;
        div = div / 10;
        }
    }
}*/       
                                     // program 20
// reverse a number 
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENETR THE NUMBER");
        int n = scn.nextInt();
        while(n>0){
            int dig = n % 10 ; // reminder pane ke liye 
            n = n/ 10 ; // n ki value ko choota karne ke liye 
            System.out.println(dig);
        }
    }
}*/
                                    // program 21
// inverse of a number { assumption is that if their is 6 digit than it will contain all the number from 1to6 without repitetion }    
// ex-) 81456273 its inverse will be 82456137 matlb ki jaise 3 jo hai 1 pe hai to inverse hone pe 1 jo hai 3 pe aa jayega aise 7 jo hai 2 pe hai to inverse hone 2 jo hai 7th posion pe aa jayega 
// logic -) inverse karte time inverse digit me 10^(inverse place -1) jaise 7 jo hai 2 pe hai to inverse hone  ke liye { 2* (10^(7-1))}
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("assumption that if their is 6 digit it  contain  number from 1to6 without repitetion");
        System.out.println("enter the number whic full fill the assumption :");
        int n = scn.nextInt();
        int inv = 0; // inverse number position
        int op = 1; // original place 
        while( n != 0){
            int od = n % 10; // od = original given digit
            int id = op; // id = inverse digit 
            int ip = od; // inverse place
            // make change change in 'inv' using 'ip' and 'id'
            inv = inv + id*(int)Math.pow(10,ip-1);
            n = n /10; // nuber ko cjotta karna 
            op++;
        }
        System.out.println(inv);
    }
}*/
                                         // program 22
//Rotation of number 
/* in this what we have to do that jaise number hai 12739 hai aur hame rotate karne ko kaha +2 se means 91273 
aur ham negavive me bhi rotation kar skate hai jaise hamae yahi same number -3 se kaha to aayega 39127
isme hame number bhi input 'n' lena hai aur kitne se rotake karna hai 'k' woh bhi input lena  */    
/*import java.util.Scanner;
 // Import Scanner class to take input from the user

public class Bsics {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in); // Create Scanner object to take input
        
        // Step 1: Take the number input
        System.out.println("Enter the number");
        int n = scn.nextInt();
        
        // Step 2: Take the rotation value (k)
        System.out.println("Enter the digit by which you want to rotate");
        int k = scn.nextInt();
        
        // Step 3: Count the number of digits (nod) in the number
        int temp = n; // Temporary variable to process the number
        int nod = 0;  // Variable to store number of digits
        while (temp != 0) { // Loop runs until all digits are removed
            temp = temp / 10; // Remove last digit
            nod++;            // Increase digit count
        }
        
        // Step 4: Handle cases where k is greater than nod
        k = k % nod; // If k is more than nod, only the remainder matters
        
        // Step 5: Handle negative rotation
        if (k < 0) {
            k = k + nod; // Convert negative rotation to equivalent positive rotation
        }
        
        // Step 6: Prepare divisors and multipliers
        int div = 1;  // Will help to split the number into two parts
        int mult = 1; // Will help to place the rotated part in front
        
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10; // div becomes 10^k
            } else {
                mult = mult * 10; // mult becomes 10^(nod-k)
            }
        }
        
        // Step 7: Split the number into two parts
        int q = n / div; // First part (remaining digits after removing k digits from end)
        int r = n % div; // Last k digits (to be rotated to front)
        
        // Step 8: Combine parts to get rotated number
        int rot = (r * mult) + q;
        
        // Step 9: Print the rotated number
        System.out.println(rot);
        
        scn.close(); // Close the Scanner to prevent memory leak
    }
}*/
                              // program 23
// lcm and GCD
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("eneter the first number");
        int n1 = scn.nextInt();
        System.out.println("enetr the second number ");
        int n2 = scn.nextInt();
        int on1 = n1;// storing orginal value of n1
        int on2 = n2;// storing orginal value of n2
        while(n1 % n2 != 0){
            int rem = n1 %n2;
            n1 = n2;
            n2 = rem;
        }
        int GCD = n2;
        //int LCM = (n1 * n2) / GCD; { IT CAN NOt be used bcz we made changes in original value}
        int LCM = (on1*on2)/GCD;// hence we3 use this
        System.out.println("LCM OF THE GIVEN NUBMER: " + on1 + " and " + on2 + " is " + LCM);
        System.out.println("GCD OF THE GIVEN NUBMER: " + on1 + " and " + on2 + " is " + GCD);

    }
}*/
                                //program 24
   //  power of four 
   /*public class Bsics {

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {  // Keep dividing by 4 if divisible
            n /= 4;
        }
        return n == 1;  // If after dividing by 4 repeatedly, the number becomes 1, it is a power of 4
    }

    public static void main(String[] args) {
        int num = 64;
        if (isPowerOfFour(num)) {
            System.out.println(num + " is a power of four.");
        } else {
            System.out.println(num + " is not a power of four.");
        }
    }
}*/
                                   // program 25
 // prime factorization
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        System.out.println("eneter the number");
        int n = scn.nextInt();
        for( int div = 2; div * div < n ; div++){ // hamne 2 se start kiya aur tab tak loop chalya jab tak uska root nahi aa gaya 
         while(n%div == 0){
            n = n / div;
            System.out.print(div + " ");
         }
        }
        if( n != 1){

          System.out.print(n); // koi aisa number aa gaya jo root ke pahle number se divide nhi ho rha that means wo bhi ek prime number hai to use bhi print kar denge
        }
    }
}*/
// note -- if u assign a double with integer value it will print it in .0 like we assign it as 19 it will print 19.0
                                              // program 26
// use if and boolena 
/*public class Bsics{
    public static void main(String[] args) {
        boolean isOnline = true;
        //boolean isOnline = false;
        if(isOnline){
            System.out.println("she is cheating"); // when true statment work 
        }
        else{
            System.out.println("she is loyal");// when false statment work 
        }
    }
}*/
// note-) to store value in string we use {nextline} is we only use next then it will not read up the part after the space line 

                                                 // program 27 
// input program function 
/*import java.util.Scanner;
public class Bsics{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scn.nextLine();
        System.out.print("enter you age:  ");
        int age = scn.nextInt();
        System.out.print("enter your gpa: ");
        double gpa = scn.nextDouble();
        System.out.print("are you student ? : (true/false)");
        boolean check = scn.nextBoolean();
        System.out.println("hello " + name);
        System.out.println("you are "+ age + " year old");
        System.out.println("your gpa is "+ gpa);
        if(check){
            System.out.println("your are enrooled as the student");
        }
        else{
            System.out.println("your are enrooled as the student");
        }
    }
}*/

/*when ever you get input buffer just use 
scanner.nextline():*/


                                                 // program 28     
 // area of the rectangele 
/*import java.util.Scanner;
 public class Bsics{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the length of the rectangle : ");
        double length = scn.nextDouble();
        System.out.print("enter  the breath of the rectangle : ");
        double breath = scn.nextDouble();
        double   area = (length * breath); 
        System.out.println(" area of the rectangle is : "+area);
    }
 }*/
                                            // program 29

