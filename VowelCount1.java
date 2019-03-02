/* This program will allow the user to input any string and the number of
vowels and consonants will be printed */

import java.util.Scanner;

public class VowelCount1
{
   public static void main (String [] args)
 {
   Scanner scan = new Scanner (System.in);
           
   int avow=0, Avow=0, evow=0, Evow=0, ivow=0, Ivow=0, ovow=0, Ovow=0, uvow=0, Uvow=0;
   String answer = null;
    
  
  do        
 {  
      System.out.println("Enter a string of characters: ");
     
      String string1;  
     
      string1 = scan.nextLine(); 
 
   
   
      for (int i=0; i < string1.length(); i++)
  
  
      switch (string1.charAt(i))
   {   case 'A' : 
       case 'a' : avow++;
               break;
       case 'E' : 
       case 'e' : evow++;
               break;
       case 'I' : 
       case 'i' : ivow++;
               break;
       case 'O' : 
       case 'o' : ovow++;
               break;
       case 'U' : 
       case 'u' : uvow++;
              break;  
       //default:  
        }
       
     System.out.println("Number of vowels in the string: ");

     System.out.println("a: " + Avow + avow + "\n" +
                        "e: " + Evow + evow + "\n" +
                        "i: " + Ivow + ivow + "\n" +
                        "o: " + Ovow + ovow + "\n" +
                        "u: " + Uvow + uvow );
  
     System.out.println("Number of non-vowel characters: " + 
      (string1.length() - Avow - avow - Evow - evow - Ivow - ivow - Ovow - ovow - Uvow - uvow));
       
    if (avow > 0 || evow > 0 || ivow > 0 || ovow > 0 || uvow > 0)
    { avow = 0;
      evow = 0;
      ivow = 0;
      ovow = 0;
      uvow = 0;
    }  
       
       System.out.println("Would you like to enter another string? ");     
                 answer = scan.nextLine();                 }
     while (answer.equals("Yes") || answer.equals("yes"));
      
 
 
 
 } //end main
 
}    // end class