import java.util.Scanner;

public class MadLib_2
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Type the name of a restaraunt (not iincluding 'the'):");
      String restarauntName = kbd.nextLine();
      
      System.out.print("Type a name: ");
      String personName = kbd.next();
      kbd.nextLine();
      
      System.out.print("Type an adjective:");
      String firstAdjective = kbd.next();
      kbd.nextLine();
     
      System.out.print("Type an adjective:");
      String secondAdjective = kbd.next();
      kbd.nextLine();
      
      double hourlyPay;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Type a number with a decimal to the hundreths place:");
      hourlyPay = keyboard.nextDouble();
      keyboard.nextLine();

      String input;
      char restarauntFirstLetter;
      System.out.print("Type the first letter of your restaraunt name:");
      input = keyboard.nextLine();
      restarauntFirstLetter = input.charAt(0);
      
      System.out.print("Type a plural noun:");
      String pluralNoun = kbd.next();
      kbd.nextLine();
      
      int hoursPerShift;
      System.out.print("Type a number between 1 and 32:");
      hoursPerShift = keyboard.nextInt();
      
      byte shiftsPerWeek;
      System.out .print("Type a number between 1 and 8:");
      shiftsPerWeek = keyboard.nextByte();
      
      int hoursPerWeek = hoursPerShift * shiftsPerWeek;
      
   }
}