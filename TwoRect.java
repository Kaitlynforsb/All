/* Given the x-coordinates and y-coordinates of two rectangles, as well as
the length and width of the rectangles, the program will determine
whether the two shapes will overlap, intersect, or not touch. */ 


import java.util.Scanner;


public class TwoRect

{
     public static void main (String [] args)
  {
  
   Scanner scan = new Scanner (System.in);
  
  Double x1, y1, w1, h1, x2, y2, w2, h2;
  
  System.out.println("Enter the x and y coordinates for the center of rectangle 1:");
  
  x1 = scan.nextDouble();
  y1 = scan.nextDouble();
  
  System.out.println("The x and y coordinates for rectangle 1 are: " + x1 + " " + y1);
  
 System.out.println("Enter the x and y coordinates for the center of rectangle 2:");
 
 x2 = scan.nextDouble();
 y2 = scan.nextDouble();
 
 System.out.println("The x and y coordinates for rectangle 2 are: " + x2 + " " + y2);
 
 System.out.println("Enter the width and height of rectangle 1:");
 
 w1 = scan.nextDouble();
 h1 = scan.nextDouble();
 
 System.out.println("The width and height of rectangle 1: " + w1 + " " + h1);
 
 System.out.println("Enter the width and height of rectangle 2:");  
  
 w2 = scan.nextDouble();
 h2 = scan.nextDouble();
 
 System.out.println("The width and height of rectangle 2: " + w2 + " " + h2);

 System.out.println("The center points of rectangle 1 is (" + x1 + ", " + y1 + "),\n" +
                       "its width is " + w1 + " units and \n" +
                       "its height is " + h1 + " units.");
                       
 System.out.println("\n");
                
 System.out.println("The center points of rectangle 2 is (" + x2 + ", " + y2 + "), \n" +
                       "its width is " + w2 + " units and \n" +
                       "its height is " + h2 + " units.");
                       
 System.out.println("\n");                      
                      
 if ( Math.abs(x1-x2) <= (w1-w2)/2 && Math.abs(y1-y2) <= (h1-h2)/2)
   System.out.println("Rectangle 2 is inside rectangle 1");
 else if (Math.abs(x1-x2) <= (w1+w2)/2 && Math.abs(y1-y2) <= (h1+h2)/2)
   System.out.println("Rectangle 2 overlaps rectangle 1");
 else
   System.out.println("Rectangle 2 does not overlap rectangle 1."); 
                    
 

  
  
  
  }
  
 }    