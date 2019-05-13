
import java.util.Scanner;

public class SphereDriver
{
   public static void main (String [] args)
 {
   double radius= 0.0; 
   double area = 0.0;
   double volume = 0.0;
  
   Scanner scan = new Scanner (System.in);
   
   Sphere sphere1 = new Sphere ();
   
   Sphere sphere2 = new Sphere (4.56, 261.3001, 397.1761);
   
   System.out.println("Here is the initial information for the 2 spheres: ");
   System.out.println(sphere1);
   System.out.println(sphere2);
    
   System.out.println("Please enter a radius for the first sphere");
   
   radius = scan.nextDouble();
   
   sphere1.setRadius(radius);
   
   double area1 = sphere1.area(radius);
   
   double volume1 = sphere1.volume(radius);
      
 
   System.out.println("Here is the final information for the two spheres: ");
   System.out.println(sphere1);
   System.out.println(sphere2);
   
   
 
 
 
 
 } //end main
} //end class      
