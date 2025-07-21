import java.util.HashSet;
import java.util.Iterator;

public class UniqueEmails {
    public static void main(String[] args) {
        
        HashSet<String> emailSet = new HashSet<>();

        
        emailSet.add("john@example.com");
        emailSet.add("alice@example.com");
        emailSet.add("bob@example.com");
        emailSet.add("john@example.com");  
        emailSet.add("ALICE@example.com"); 

      
        Iterator<String> iterator = emailSet.iterator();

        System.out.println("Unique Email Addresses:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
