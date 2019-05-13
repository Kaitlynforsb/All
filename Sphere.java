
import java.text.DecimalFormat;

public class Sphere
{

   private double radius;
   private double area;
   private double volume;

   //constructor 1
   public Sphere ()
 {
   radius = 0.0;
   area = 0.0;
   volume = 0.0;
 } 

   //constructor 2
   public Sphere (double rad, double area1, double volume1)
 {
     radius = rad;
     area = area1;
     volume = volume1;
 } 
   // mutator or setter method
   public void setRadius (double value1)
 {
   radius = value1;
 } 
 
   public void setArea (double value2)
 {
   area = value2;
 } 

   public void setVolume (double value3)
 {
   volume = value3;
 } 



public double area(double radius)
{
   area = Math.PI * 4 * Math.pow(radius, 2);
   return area;
}


public double volume(double radius)
{
   volume = Math.PI * 4 * 1/3 * Math.pow(radius, 3);
   return volume;
}

public String toString()
{
    DecimalFormat fmt = new DecimalFormat("0.####");
    
    return ("radius: " + fmt.format(radius) + "\t" + "area: " + fmt.format(area) + "\t" + "volume: " +  fmt.format(volume));
}






} //end class