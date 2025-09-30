import java.util.Scanner;

public class GradeChecker
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your score: ");
      double testScore;
      testScore = keyboard.nextDouble();
      
      if (testScore < 60)
         System.out.println("Your grade is F");
      else if (testScore < 70)
         System.out.println("Your grade is D");
      else if (testScore < 80)
         System.out.println("Your grade is C");
      else if (testScore < 90)
         System.out.println("Your grade is B");
      else
         System.out.println("Your grade is A");
   }
}