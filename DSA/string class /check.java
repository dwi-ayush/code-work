public class check{
    public static void main(String[] args) {
         String name ="Pasworrd";
         //if(name.equals("pasword"))// it will checj case sentivity also 
         if(name.equalsIgnoreCase("pasworrd"))// to avoid the check of case sensitivity 
         {
            System.out.println("matched");
         }
         else{
            System.out.println("not matched ");
         }
    }
}