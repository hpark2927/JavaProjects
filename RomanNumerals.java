import java.util.Scanner;

public class RomanNumerals
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a number between 10 and 20: ");
      
      int number = keyboard.nextInt();
      
      if (number < 10 || number > 20)
      {
         System.out.println("Number not within range, exiting.");
      }
      else
      {
         String roman;
         
         switch (number)
         {
            case 10:
            roman = "X";
            break;
            case 11:
            roman = "XI";
            break;
            case 12:
            roman = "XII";
            break;
            case 13:
            roman = "XIII";
            break;
            case 14:
            roman = "XIV";
            break;
            case 15:
            roman = "XV";
            break;
            case 16: 
            roman = "XVI"; 
            break;
            case 17: 
            roman = "XVII"; 
            break;
            case 18: 
            roman = "XVIII"; 
            break;
            case 19: 
            roman = "XIX"; 
            break;
            case 20: 
            roman = "XX"; 
            break;
            
            default: roman = "";
         }
         
         System.out.println(number + " in Roman Numerals is " + roman);
         
      }
   }
}