/* The user inputs a certain number of seconds and the program
gives the seconds value given into hours, minutes, and seconds */

import java.util.Scanner;

public class SecondsConv

{   
   public static void main (String [] args)
 {  
   Scanner scan = new Scanner (System.in);
   
   System.out.println("Enter the number of seconds:");
   
   //String input = scanner.nextLine();
   final int SEC_HOUR = 3600 ;
   final int SEC_MIN = 60 ;
   
   int input = scan.nextInt();
   
   int hours = input / SEC_HOUR ;
   int minutes = (input % SEC_HOUR)/SEC_MIN ;
   int seconds = ((input % SEC_MIN));
   
   
   System.out.println("hours= " + hours + "\nminutes= " + minutes + "\nseconds= " + seconds);    
   
   
  }
     } 