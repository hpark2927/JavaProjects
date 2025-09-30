public class ForLoop
{
   public static void main(String[] args)
   {
      int count;
      for (count = 1; count <= 5; count++)
      {
         System.out.println("Hello");
      }
      
      System.out.println("Number Number Squared");
      System.out.println("_____________________");
      
      for (int number = 1; number <= 10; number++)
      {
         System.out.println(number + "\t\t" + number * number);
      }
   }
}