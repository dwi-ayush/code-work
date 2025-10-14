import java.util.Scanner;
public class enhanced{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the day of the week ");
        String day = scn.nextLine();
         switch(day){
            case "monday","tuesday", "wednesday" ,"thursday" ,"friday" -> 
            System.out.println("it is weekday");
            // preforming of multiple case a same task we use this method
            case "saturday" , "sunday" ->
             System.out.println("it is weekend");
            default -> System.out.println(day + " it is not a day");
         }

    }
}