import java.util.Scanner;

public class BaseConversion
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int decimalNumber;
      
      do
      {
         System.out.println("Enter a 10-base positive number you'd like to convert to a binary number");
         decimalNumber = keyboard.nextInt();
         
         if (decimalNumber < 0)
         {
            System.out.println("Incorrect, enter another number");
         }
      } while (decimalNumber < 0);
      
      String binary = "";
      int original = decimalNumber;
      
      if (decimalNumber == 0)
      {
         binary = "0";
      } 
      else
      {
         while (decimalNumber > 0)
         {
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            decimalNumber = decimalNumber / 2;
         }
      }

        System.out.println(original + " in binary is " + binary);
   }
}