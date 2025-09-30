import javax.swing.JOptionPane;

public class StringsToNumbers
{
   public static void main(String[] args)
   {
      // convert a string to a byte
      int number;
      String stri;
      stri = JOptionPane.showInputDialog("Enter a number.");
      number = Integer.parseInt(stri);
      
      String str = "12345";
      int num = Integer.parseInt(str);
      System.out.println(num);
      

      
   }
}