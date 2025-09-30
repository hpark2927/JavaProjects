import java.util.Scanner;

public class ScannerStudentID
{
   public static void main(String[] args)
   {
      //get the user's first initial of first name
            
      String firstNameInitial;

      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the first initial of your first name: ");
      firstNameInitial = keyboard.nextLine();
      
      //get the user's full last name
      
      String lastName;
      
      System.out.println("Enter your full last name: ");
      lastName = keyboard.nextLine();
      
      //get the user's last 4 digits of student ID
      
      int lastFourDigitsID;
      
      System.out.println("Enter the last 4 digits of your student ID: ");
      lastFourDigitsID = keyboard.nextInt();
      
      //diaply full student ID
      
      String fullID = firstNameInitial + lastName + lastFourDigitsID;
      
      System.out.println("Your student ID is " + fullID);
      
      keyboard.close();
   }
}