public class Formulas_4
{
   public static void main(String[] args)
   {
   
   double pi = 3.14159265359;
   int radius = 7;
   double area = pi * radius * radius;
   
   System.out.println("The area of a circle with a radius of " + radius + " is " + 
                      area);                                                          
   
   double celsius = 27.5;
   double conversionFactor = 1.8;
   int baseTemperature = 32;
   double fahrenheit = celsius * conversionFactor + baseTemperature;
                    
   System.out.println("27.5\u00B0C in Fahrenheit is: " +
                      fahrenheit);               
   }

}