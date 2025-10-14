import java.util.*;

public class condomarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of packets of condoms you have purchased: ");
        int size = scn.nextInt();
        
        scn.nextLine(); // consume newline

        String[] flavours = new String[size];
        
        // Input the flavour names
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the condom flavour name you purchased: ");
            flavours[i] = scn.nextLine();
        }

        System.out.print("Enter the condom flavour name you want to search: ");
        String key = scn.nextLine();

        // Search for the flavour
        
        boolean found = Arrays.stream(flavours)
                              .anyMatch(f -> f.equalsIgnoreCase(key));

        if (found) {
            System.out.println("Flavour found!");
        } else {
            System.out.println("Flavour not found!");
        }

        scn.close();
    }
}
