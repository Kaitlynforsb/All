
import java.text.NumberFormat;

public class TechStocks
{

   private String name, label;
   private double price;
   private int share;
   private static double totalCost = 0;
   
   public TechStocks (String names, int shares)
  {
      name = names;
      share = shares;
      
      setLabel();
      setPrice();
  
  } //end constructor 
  
   private void setLabel()
  {
      switch (name.toLowerCase())
     {
         case "amazon": label = "AMZN";
                         break;
         case "apple": label = "AAPL";
                         break;
         case "facebook": label = "FB";
                         break;
         case "gopro": label = "GPRO";
                         break;
         case "google": label = "GOOGL";
                         break;
         case "irobot": label = "IRBT";
                         break;
         case "microsoft": label = "MSFT";
                         break;
         case "netflix": label = "NFLX";
                         break;
         case "tesla": label = "TSLA";
                         break;
         case "twitter": label = "TWTR";
                         break;   
     
     } //end switch 
  
  
  } //end method 
  
   private void setPrice()
 {
     switch (name.toLowerCase())
     {
         case "amazon": price = 1863.04;
                         break;
         case "apple": price = 199.25;
                         break;
         case "facebook": price = 178.87;
                         break;
         case "gopro": price = 6.71;
                         break;
         case "google": price = 1231.91;
                         break;
         case "irobot": price = 129.68;
                         break;
         case "microsoft": price = 120.77;
                         break;
         case "netflix": price = 359.46;
                         break;
         case "tesla": price = 273.36;
                         break;
         case "twitter": price = 34.46;
                         break;   
                         
                         
      } //end switch
     
 } //end method
  
  
    private double calCost()
  {
      double cost = price * share;
      
      totalCost += cost;
      
      return cost;
  
  } //end method 
  
      public static double getTotalCost()
    {   
         return totalCost;
    
    } //end method  
  
  
      public String toString()
    {
         NumberFormat fmt = NumberFormat.getCurrencyInstance();
         
         String description;
   
         description = String.format("%-20s", name) +
                       String.format("%-20s", label) +
                       String.format("%-20s", fmt.format(price)) +
                       String.format("%-20s", fmt.format(calCost()));
  
    
         return description;
         
    } //end method  
   
   











}