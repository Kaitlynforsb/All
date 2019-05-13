import javax.swing.JOptionPane;

public class MetalsDriver
{
   public static void main (String [] args)
 {
   int num;
   String name;
   double oz; 
   
   String input1, input2;  

   input1 = JOptionPane.showInputDialog("How many metals (>= 1) are you interested in? ");

   num = Integer.parseInt(input1);
   
   while (num < 1)
  {
      System.out.println("Invalid input. Please enter a number >= 1.");
     
     input1 = JOptionPane.showInputDialog("How many metals (>= 1) are you interested in? ");

     num = Integer.parseInt(input1);

  } 
  
   Metals [] metal = new Metals [num];
      
  for (int i = 0; i < num; i++)
 {
 
  name = JOptionPane.showInputDialog("Which metal are you interested in?");
   
  input2 = JOptionPane.showInputDialog("How many oz of (> 0) for " + name);
  
  oz = Double.parseDouble(input2);
  
  while (oz < 0)
 {
   System.out.println("Invalid input. Please enter a number > 0");
   
   input2 = JOptionPane.showInputDialog("How many oz of (> 0) for " + name);
  
   oz = Double.parseDouble(input2);
   
 } //end while loop 
 
 metal[i] = new Metals(name, oz);
 
 System.out.println(metal[i]);
 

 } //end for loop 
   
  
 
 
 
 
 
 }
}   