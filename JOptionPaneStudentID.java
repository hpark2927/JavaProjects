import javax.swing.JOptionPane;

public class JOptionPaneStudentID
{
   public static void main(String[] args)
   {
      String firstNameInitial, lastName;
      
      //get the user's first initial of first name
      
      firstNameInitial = JOptionPane.showInputDialog("Enter the first initial of your first name: ");
      
      //get the user's full last name
      
      lastName = JOptionPane.showInputDialog("Enter your full last name: ");
      
      //get the user's last 4 digits of student ID
      
      int lastFourDigitsID;
      String str;
      
      str = JOptionPane.showInputDialog("Enter the last 4 digits of your student ID: ");
      
      lastFourDigitsID = Integer.parseInt(str);
      
      //display full student ID
      
      String fullID = firstNameInitial + lastName + lastFourDigitsID;
      
      JOptionPane.showMessageDialog(null, "Your student ID is " + fullID);
   
   }
}