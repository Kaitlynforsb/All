/* This program will print up to 100 verses of the "traveling song",
based upon the user's input */

import java.util.Scanner;

public class TravelingSong
{
    public static void main (String [] args)
 {
 
     Scanner scan = new Scanner (System.in);
     
     int num, end ;
     
     System.out.println("How many verses of the traveling song (1 to 100)?");
     
     num = scan.nextInt();
     
     System.out.println(num + " verses");
 
     while (num < 0 || num > 100)
    {
      System.out.println("Invalid input. Please enter a value 0 to 100");
      num = scan.nextInt();
      System.out.println(num + " verses");
     }  
     
     
     
     end = (100-num);
     
     for (int verses = 100 ; verses >= end ; verses--)
    {
      System.out.println(verses + " bottles of beer on the wall \n" 
            + verses + " bottles of beer \n" 
            + "If one of those bottles happens to fall \n"
            + verses + " bottles of beer on the wall."); 
     }
     
     
     
 
 }
}    