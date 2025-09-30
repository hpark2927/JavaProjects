import java.util.Scanner;

public class UserOptions
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please choose one of the following options:");
      System.out.println("=======================");
      System.out.println("1. Win the math lottery");
      System.out.println("2. Convert liters to gallons ");
      System.out.println("Enter your choice 1 or 2: ");
      
      int choice;
      choice = keyboard.nextInt();
      
      if (choice == 1)
      {
         System.out.println("Welcome to Math Lottery!");
         System.out.println("Solve the following math equation to win the lottery."); 
         System.out.println("6 + 4 / 2 = ");
         System.out.println("Enter the answer: ");
         
         int userAnswer;
         userAnswer = keyboard.nextInt();
         
         if (userAnswer == 8)
         {
            System.out.print("Correct! You win the lottery!");
         }
         else if (userAnswer == 5)
         {
            System.out.print("Sorry, that's not correct. The answer was 8." +
                             " But that's a common mistake! Perhaps you didn't follow the order or operations.");
         }
         else
         {
            System.out.print("Sorry, that's not correct. The answer was 8.");
         }
      }
      else if (choice == 2)
      {
         System.out.println("Welcome to Liter-Gallon Conversion!");
         System.out.println("Enter the amount in liters: ");
         double liters = keyboard.nextDouble();
         
         if (liters >= 0)
         {
            double gallons = liters * 0.264172;
            System.out.println(liters + " liters is approximately " + gallons + " gallons. "); 
         }
         else
         {
            System.out.println("Error: You cannot enter a negative number. Please try again.");
         }
      }
      else
      {
         System.out.println("Menu option not valid. Exiting...");
      }
   }
}