import java.util.Scanner;

public class AverageScore
{
   public static void main(String[] args)
   {
      double score1, score2, score3, average;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("This program averages 3 test scores.");
      
      System.out.println("Enter score #1: ");
      score1 = keyboard.nextDouble();
      
      System.out.println("Enter score #2: ");
      score2 = keyboard.nextDouble();
      
      System.out.println("Enter score #3: ");
      score3 = keyboard.nextDouble();
      
      average = (score1 + score2 + score3) / 3.0;
      System.out.println("The average score is " + average);
      
      if (average > 95)
      System.out.println("That's a great score!");
      
      int A = 10;
      int B = 20;
      
      if (A < B)
         System.out.println("A is less than B");
   }
}