import java.util.Scanner;

public class UserSquares
{
   public static void main(String[] args)
   {
      int number;
      int maxValue;
      
      System.out.println("I will display a table of " +
                         "numbers and their squares.");
                         
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("How high should I go? ");
      maxValue = keyboard.nextInt();
      
      System.out.println("Number Number squared");
      System.out.println("_____________________");
      
      for (number = 1; number <= maxValue; number++)
      {
         System.out.println(number + "\t\t" + number * number);
      }
   }
}