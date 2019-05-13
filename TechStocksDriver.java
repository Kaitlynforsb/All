
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class TechStocksDriver
{
   public static void main (String [] args)
 {
 
   String input1, input2;
   int num, numShares ;
   String name;
   
   input1 = JOptionPane.showInputDialog("How many (>= 1) companies' stocks are you interested in?");
   
   num = Integer.parseInt(input1);
   
    while (num < 1)
  {
      System.out.println("Invalid input. Please enter a integer >= 1");
      
      input1 = JOptionPane.showInputDialog("How many (>= 1) companies' stocks are you interested in?");
   
      num = Integer.parseInt(input1);
  } 
  
    TechStocks [] stock = new TechStocks[num];
    
    for (int i = 0; i < num; i++)
  {
      name = JOptionPane.showInputDialog("Enter the name of company " + (i+1) + ":");
      
      input2 = JOptionPane.showInputDialog("Enter the amount of shares (>= 1) for " + name);
  
      numShares = Integer.parseInt(input2);
      
    while (numShares < 1)
  {
      System.out.println("Invalid input. Please enter a value >= 1");
      
      input2 = JOptionPane.showInputDialog("Enter the amount of shares (>= 1) for " + name);
  
      numShares = Integer.parseInt(input2);
      
  } //end while loop  
      
      stock[i] = new TechStocks(name, numShares);
      
      System.out.println(stock[i]);
      
     
        
  
  
  } //end loop  
  
  
  NumberFormat fmt = NumberFormat.getCurrencyInstance();
  
    
  System.out.println("Total cost: " +  fmt.format(TechStocks.getTotalCost()));
  

  
     

 
 
 
 
 
 
 
 } //end main
} //end class    