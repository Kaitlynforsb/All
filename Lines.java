/* This program gets the coordinates of two lines, calculates and 
displays the equations of the lines, then calculates and
displays the intersection of the lines if it exists. */ 


import java.util.Scanner;

import java.text.DecimalFormat;

public class Lines

{
   public static void main (String [] args) 
 {
   Scanner scan = new Scanner (System.in);
   
   DecimalFormat fmt = new DecimalFormat ("0.##");
   DecimalFormat fmt1 = new DecimalFormat ("#");
   
   double x, y, x1, x2, x3, x4, y1, y2, y3, y4, a, b, c, d, e, f, denom, eq1, eq2;
   
   System.out.println("Please enter the points for line 1 individually: x1, y1, x2, y2");
  
   x1 = scan.nextDouble();
   y1 = scan.nextDouble();
   x2 = scan.nextDouble();
   y2 = scan.nextDouble();
   
  System.out.println("Please enter the points for line 2 individually: x3, y3, x4, y4");
   
  x3 = scan.nextDouble();
  y3 = scan.nextDouble(); 
  x4 = scan.nextDouble(); 
  y4 = scan.nextDouble();  

    
   a = (y1 - y2);
   b = -(x1 - x2);
   c = (y3 - y4);
   d = -(x3 - x4);
   e = (y1 - y2)*x1 - (x1 - x2) *y1;
   f = (y3 - y4) * x3 - (x3 - x4) * y3;
   
   denom = a*d - b*c;
   eq1 = e*d-b*f/denom;
   eq2 = a*f-e*c/denom;
   x = eq1;
   y = eq2;
   

   
   System.out.println("The coordinates of line 1 are: (" +  x1  + "," + y1 +  ") " + "," + "(" + x2  + "," + y2 + ")" );
   System.out.println("The equation for line 1 is: " + fmt1.format(a) + "x" + "+" + fmt1.format(b) + "y" + "=" + fmt1.format(e) );
  
  
  // ax+by=e Line 1
  
  
  
   System.out.println("The coordinates of line 2 are: (" +  x3  + " , " +  y3 + " )" + " , " + " ( " + x4  + " , " +  y4 + " ) " );
   System.out.println("The equation for line 2 is: " + fmt1.format(c) + "x" + "+" + fmt1.format(d) + "y" + "=" + fmt1.format(f));
   
      if (denom == 0)
      System.out.println("The two lines are parallel");
   else if (denom <0)
      System.out.println("The two lines are not parallel. The intersecting point is (" + fmt.format(x) + "," + fmt.format(y) + ") ");
       
 
 
 
 }
}   