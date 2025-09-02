import java.util.Scanner;
public class normal{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the day of the week ");
        String day = scn.nextLine();
         switch(day){
            case "monday" -> System.out.println("it is chestday");
            case "tuesday" -> System.out.println("it is bicepsday");
            case "wednesday" -> System.out.println("it is shoulderday");
            case "thursday" -> System.out.println("it is backday");
            case "friday" -> System.out.println("it is absday");
            case "saturday" -> System.out.println("it is legday");
            case "sunday" -> System.out.println("it is weekend");
            default -> System.out.println(day + " it is not a day");
         }

    }
}
// {->} state that if this is the case perfor this task 
// default is used whn non of the case is true 