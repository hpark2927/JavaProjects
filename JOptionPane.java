import javax.swing.JOptionPane;

public class JOptionPane
{
   public static void main(String[] args)
   {
      // Display a greeting that says "Hello World"
      JOptionPane.showMessageDialog(null, "Hello World");
      
      // Get the user's first name      
      String firstName,lastName;
      firstName = JOptionPane.showInputDialog("What is your firsrt name?");
      
      // Get the user's last name
      lastName = JOptionPane.showInputDialog("What is your last name?");
      
      // Display a greeting that says "Hello, firstName lastName"
      JOptionPane.showMessageDialog(null, "Hello, " + firstName + " " + lastName);
      
      System.exit(0);
   }
}