import java.util.Scanner;

public class Demographics
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter your name: ");
      String yourName;
      yourName = keyboard.nextLine();
      
      System.out.print("Enter your age: ");
      int yourAge;
      yourAge = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Please enter where you live: ");
      String address = keyboard.nextLine();
      
      System.out.print("Your name is " + yourName + "." + " You are " + yourAge + " years old, and you reside in " + address);      
            
      keyboard.close();
      
   }
}
    