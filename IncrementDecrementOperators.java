public class IncrementDecrementOperators
{
   public static void main(String[] args)
   {
      int number = 4;
      
      System.out.println("Number is " + number + ".");
      System.out.println("I will increment number.");
      
      //Postfix mode: the operator is placed after the variable.
      
      number++;
      
      System.out.println("Now, the number is " + number + ".");
      System.out.println("I will now decrement this number.");
      
      number--;
      
      System.out.println("Now, the number is back to " + number);
      
      /*
      
      Prefix mode: the operator is placed before the variable name
      
      ++number;
      --number;
      
      */
      
      number = 4;
      System.out.println(++number); /* Prefix mode causes the increment to happen first */
      
      number = 4;
      System.out.println(number++); /* Postfix mode causes the increment to happen after the value of the variable
                                       is used in the expression */
                                       

     
      
    }
}