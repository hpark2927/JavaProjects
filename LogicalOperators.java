public class LogicalOperators
{
   public static void main(String[] args)
   {
      double temperature, minutes;
      temperature = 30;
      minutes = 20;
      
      if (temperature >= 15 || minutes >= 20)
      {
         System.out.println("The temperature is in the danger zone.");
      }
      
      //"Is the temperature not greater than 100?"
      
      if (!(temperature > 100))
      {
         System.out.println("This is below the maximum temperature.");
      }
      
      int x = 10;
      
      if (x >= 20 && x <= 40)
      {
         System.out.println(x + " is in the acceptable range.");
      }
      else
      {
         System.out.println(x + " is outside the acceptable rage.");
      }
      
      /*
      
      if (x < 20 || x > 40)
      {
         System.out.println(x + " is outside the acceptable rage.");
      }
      
      */
      
      String name1 = "Mark";
      String name2 = "Mary";
      
      if (name1.equals(name2))
      {
         System.out.println( name1 + " and " + name2 + " are the same." );
      }
      else
      {
         System.out.println( name1 + " and " + name2 + " are not the same.");
      }
      
      if (name1.compareTo(name2) < 0)
      {
         System.out.println( name1 + " is less than " + name2 );
      }
      else if (name1.compareTo(name2) == 0)
      {
         System.out.println( name1 + " is equal to " + name2 );
      } 
      else if (name1.compareTo(name2) > 0)
      {
         System.out.println( name1 + " is greater than " + name2 );
      }      
   }
}