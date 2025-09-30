import java.util.Scanner;
import java.util.Random;

public class PasswordChecker
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      Scanner kbd = new Scanner(System.in);
      System.out.println("Please enter how many characters your password should be: ");
      int passwordLength = kbd.nextInt();
      
      if(passwordLength < 10)
      {
         System.out.println("Sorry, password length too short.");
      }
      else
      
         if(passwordLength > 60)
         {
            System.out.println("Sorry, password length too long.");
         }
         else
         
            if(passwordLength >= 10 && passwordLength <= 60)
            {
               int randomNumber;
               String newPassword = "";
               for(int count = 0; count < passwordLength; count++)
               {
                  randomNumber = rand.nextInt(94) + 33;
                  char c = (char) randomNumber;
                  newPassword = newPassword + c;
               }
               System.out.println("Your new password is: " + newPassword);
             }
   }  
}