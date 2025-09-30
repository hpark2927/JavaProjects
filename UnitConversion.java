public class UnitConversion
{
   public static void main(String[] args)
   {
   
   // a. The diameter of a circle with a radius of 4
      
   int radius = 4; 
   int cirDiameter = 2 * radius; 
   System.out.println( "The diameter of a circle is: " + cirDiameter );
        
   // b. the average of the numbers 17, 37, and 111
      
   int num1 = 17;
   int num2 = 37;
   int num3 = 111; 
   double aveOfNumbers = ( num1 + num2 + num3 ) / 3.0;
   System.out.println( "The average of numbers is: " + aveOfNumbers );
   
   // c. the sum of a series of numbers from 1 to 100
   
   int endNumber = 100;
   int sumOfSeries = (endNumber * (endNumber + 1)) / 2;
   System.out.println( "The sum of a series of numbers from 1 to " + endNumber + " is: " + sumOfSeries );
   
   // d. 112.4 degrees Fahrenheit in Celsius and Kelvin
   
   double fahrenheit = 112.4;
   double celsius = ( 5.0 / 9.0 ) * ( fahrenheit - 32 );
   double kelvin = celsius + 273.15; 
   String degree = "\u00B0";
   
   System.out.println( fahrenheit + degree + "F" + " in Celsius is " + celsius + degree + "C" + " and " + kelvin + " K in Kelvin\n" );
      
   // e. the number of quarters, dimes, nickels, and pennies in 97 cents
   
   int totalCent = 97;
   int centsPerQuarter = 25;
   int centsPerDime = 10;
   int centsPerNickel = 5;
   int centsPerPenny = 1;  
   System.out.println( "For " + totalCent + " Cents, " + "you need" );
  
   int quarters = totalCent / centsPerQuarter;
   int remainingQuarters = totalCent % centsPerQuarter;
   System.out.println( "Quarters: " + quarters + ", Remaining cents: " + remainingQuarters );
   
   int dimes = totalCent / centsPerDime;
   int remainingDimes = totalCent % centsPerDime;
   System.out.println("Dimes: " + dimes + ", Remaining cents: " + remainingDimes );
     
   int nickels = totalCent / centsPerNickel;
   int remainingNickels = totalCent % centsPerNickel;
   System.out.println("Nickels: " + nickels + ", Remaining cents: " + remainingNickels );
      
   int pennies = totalCent / centsPerPenny;
   int remainingPennies = totalCent % centsPerPenny;
   System.out.println("Pennies: " + pennies + ", Remaining cents: " + remainingPennies + "\n" );
   
   // f. the hypotenuse for a right triangle with sides of 7 and 9.3
   
   int side1 = 7;
   double side2 = 9.3;
   double hypotenuse1 = Math.sqrt ( side1 * side1 + side2 * side2 );
   System.out.println("The hypotenuse using arithmetic operators is: " + hypotenuse1 );
   
   double hypotenuse2 = Math.sqrt ( Math.pow (side1, 2) + Math.pow (side2, 2) );
   System.out.println("The hypotenuse using Math.pow() method is: " + hypotenuse2 );  
   
   }
   
}


