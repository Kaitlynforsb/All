import java.text.NumberFormat;

public class Metals
{

   private String name, symbol;
   private double price, oz;
     
   public Metals (String names, double ozs)
 {
   name = names;
   oz = ozs;
   
   setSymbol();
   setPrice();
 }  
   
   private void setSymbol()
  {
       
    switch (name.toLowerCase())
    {
      case "platinum": symbol = "Pt";
                       break;
      case "palladium": symbol = "Pd";
                       break;
      case "rhodium": symbol = "Rh";
                       break;
      case "iridium": symbol = "Ir";
                       break;
      case "ruthenium": symbol = "Ru";
                       break;
      case "osmium": symbol = "Os";
                       break;
      case "rhenium": symbol = "Re";
                       break;
      case "gold": symbol = "Au";
                       break;
      case "silver": symbol = "Ag";
                       break;
      default:
            System.out.println("Not precious metal");                     
                       

   
      
    } //end switch
    
  } //end method
   
   private void setPrice()
  {    
    switch (name.toLowerCase())
  {   
      case "platinum": price = 844;
                       break;
      case "palladium":price = 1150;
                       break;
      case "rhodium":  price = 2590;
                       break;
      case "iridium":  price = 1485;
                       break;
      case "ruthenium":price = 270;
                       break;
      case "osmium":   price = 400;
                       break;
      case "rhenium":  price = 107.5;
                       break;
      case "gold":     price = 1227.73;
                       break;
      case "silver":   price = 14.33;
                       break;
      default: price = 0;
                                
  
} //end switch  
    
       
    
} //end method

      private double calcCost()
  {   
      double cost = price * oz;
      
         return cost;
  } 
    
    
      public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
          
      return("name: " + name + " \n symbol: " + symbol +
                     "\n price per oz: " + fmt.format(price) + "\n oz: " + oz + " \n cost: " + fmt.format(calcCost()));  
                     
      
   }   

   



} //end class