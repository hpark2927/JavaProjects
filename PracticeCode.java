import java.util.Scanner;

public class PracticeCode
{
   public static void main(String[] args)
   {      
      String item1 = "Computer";
      String item2 = "Coffee";
      String item3 = "Aspirin";
      
      System.out.println("These are our top sellers:");
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3 + "\n");
      
      System.out.print("My name is ");
      
      char letter1, letter2, letter3, letter4, letter5;  
      letter1 = 'K';
      letter2 = 'a';
      letter3 = 't';
      letter4 = 'i';
      letter5 = 'e';
      
      System.out.print(letter1);
      System.out.print(letter2);
      System.out.print(letter3);
      System.out.print(letter4);
      System.out.println(letter5);
      System.out.print("\n");
      
      int cars = 5;
      System.out.println("I own " + cars + " cars" + "\n");
    
      double price, tax, total;
      price = 29.75;
      tax = 1.76;
      total = 31.51;
      
      System.out.println("The price of the item is " + price );
      System.out.println("The tax is " + tax );
      System.out.println("The total is " + total + "\n");
        
      double distance, mass;
      distance = 1.495979E11;
      mass = 1.989E30;
      System.out.println("The sun is " + distance + " meters away");
      System.out.println("The sun's mass is " + mass + " kilograms");
      
      boolean test;
      
      test = true;
      System.out.println(test);
      test = false;
      System.out.println(test);
      System.out.print("\n");
      
      double regularWages;
      double basePay = 25;
      double regularHours = 40;
      double overtimeWages;
      double overtimePay = 37.5;
      double overtimeHours = 10;
      double totalWages;
      
      regularWages = basePay * regularHours;
      overtimeWages = overtimePay * overtimeHours;
      totalWages = regularWages + overtimeWages;
      
      System.out.println("Wages for this week are" + " $" + totalWages);
      System.out.println();
      
      double number1;
      number1 = 5/2;
      System.out.println(number1);
      double number2;
      number2 = 5.0 / 2;
      System.out.println(number2);
      
      System.out.println(17 / 2);
      System.out.println(17.0 / 2);
      
      System.out.println(17 % 2);
      System.out.println(4 + 17 % 2 -1);
      System.out.println((4 + 17) % 2 -1);
      
      int remainder;
      int x = 9;
      remainder = x % 4;
      System.out.println(remainder);
      System.out.println();
      
      final double PRICE = 19.99;
      System.out.println("The price is " + PRICE);
      
      final double AMOUNT;
      AMOUNT = 48.2;
      System.out.println("The amount is " + AMOUNT);
      
      double area;
      final double PI = Math.PI;
      double radius = 7;
      area = PI * radius * radius;
      System.out.println("The area of a circle with radius of " + radius + " is " + area);
      
      String greeting;
      greeting = "Good morning, ";
      String name = "Herman";
      System.out.println(greeting + name);
      
      int stringSize;
      stringSize = name.length();
      System.out.println(name + " has " + stringSize + " characters.");
      
      char letter;
      letter = name.charAt(1);
      System.out.println("The second letter of " + name + " is " + letter + ".");
      
      String bigName = "HERMAN";
      String littleName = bigName.toLowerCase();
      System.out.println(bigName + " in lower case is " + littleName + ".");
      
      String name2 = "Katie";
      String littleName2;
      littleName2 = "katie";
      String bigName2;
      bigName2 = littleName2.toUpperCase();
      System.out.println(littleName2 + " in upper case is " + bigName2);
      System.out.println();
      
      String message = "Java is Great Fun!";
      String upper = message.toUpperCase();
      String lower = message.toLowerCase();
      char letter_2nd = message.charAt(2);
      int stringSize_2 = message.length();
      
      System.out.println(message);
      System.out.println(upper);
      System.out.println(lower);
      System.out.println(letter_2nd);
      System.out.println(stringSize_2);
      
      /*
      
      this is a comment
      
      */
      
      Scanner keyboard = new Scanner(System.in);
      
      String yourName;
      yourName = keyboard.nextLine();
      System.out.println("Enter your name: ");

      int yourAge;
      yourAge = keyboard.nextInt();
      System.out.println("Enter your age: ");
      
   }
}