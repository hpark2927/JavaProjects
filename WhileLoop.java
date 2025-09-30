public class WhileLoop
{
   public static void main(String[] args)
   {
      int number = 1;
      
      while (number <= 5)
      {
         System.out.println("Yay");
         number++;
      }
      
      System.out.println("That's all!");
      
      //When the condition for exiting the loop is never met, it is called an infinite loop, which causes the program to run endlessly.
      
      int number2 = 1;
      
      while (number2 <= 5)
      {
         System.out.println("Hello");
      }
   }
}