/* This program allows the user to input his or her name,
hours worked, and pay rate and will output the individual's name 
and the gross pay during the hours worked */

import javax.swing.JOptionPane; //JOptionPane only deals with strings

import java.text.NumberFormat;

public class PayrollDialog
{
   public static void main (String [] args)
  {
    
    int result = JOptionPane.NO_OPTION;
    
    while (result == JOptionPane.NO_OPTION) 
    
       { 
       
      String input; //reads input
      String name;
      int hours;
      double payRate, pay;
      
   NumberFormat f = NumberFormat.getCurrencyInstance();
   
   //Get name
   name = JOptionPane.showInputDialog("What is your name?");
   
   //Get hours
   input = JOptionPane.showInputDialog("How many hours did you work?");
   
   //convert string to an int
   hours = Integer.parseInt(input); //Wrapper class = Integer, Double
   
   //get pay rate
   input = JOptionPane.showInputDialog("What is the pay rate?");
   
   //convert String to Double
   payRate = Double.parseDouble(input);
  
   //pay
   pay = hours * payRate;
   
   //display the results
   JOptionPane.showMessageDialog(null, "Hello " + name +
               ". Your pay is " + f.format(pay));  
   
   
   result =  JOptionPane.showConfirmDialog(null, "Are you done?", "Make a choice!", JOptionPane.YES_NO_CANCEL_OPTION);  

   
   }
       
    
   
   
    
     
     
     
     /* if (result == JOptionPane.YES_OPTION) {
           System.exit(0);
      else if (result == JOptionPane.NO } */
         
       
 
 
 
    
 
         

 
  
  
  
  
  
  
  }// end main
  
} //end class 