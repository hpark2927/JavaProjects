import java.util.Scanner;

public class MagicNamesCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if (username.equals("root") || 
            username.equals("admin") || 
            username.equals("ada") || 
            username.equals("sima") ||
            username.equals("flynn")) {
            
            System.out.println("Super user access granted!");
        } else {
            System.out.println("Access denied, end of line.");
        }

        scanner.close();
    }
}
