import java.util.ArrayList;

public class ALTest
{
   public static void main (String [] args)
 {  
   ArrayList<String> band = new ArrayList <> ();
   
   band.add("Ringo");
   band.add("Paul");
   band.add(1, "George");
   band.add("John");
   
   System.out.println("Number of people: " + band.size());
   
   System.out.println(band);
   
   band.clear();
   
   System.out.println("Number of people: " + band.size());

   
   
   
   
   
   
   
   


 }
}