import java.util.Scanner;

public class MiniAddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int maxContacts = 5;

      
        String[] names = new String[maxContacts];
        String[] phones = new String[maxContacts];
        String[] emails = new String[maxContacts];

        System.out.println(" Mini Address Book ");

        
        for (int i = 0; i < maxContacts; i++) {
            System.out.println("Enter details for contact #" + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Phone: ");
            phones[i] = scanner.nextLine();
            System.out.print("Email: ");
            emails[i] = scanner.nextLine();
            System.out.println();
        }

        
        System.out.println("Stored Contacts");
        for (int i = 0; i < maxContacts; i++) {
            System.out.println("Contact #" + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Phone: " + phones[i]);
            System.out.println("Email: " + emails[i]);
            System.out.println("---------------------------");
        }

        scanner.close();
    }
}
