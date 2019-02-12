/* Once a six-digit "ticket" number is inputted, the program will
state whether the ticket is valid or not, based on the last digit
and remainder of the ticket. If the last digit of the ticket and remainder
of the ticket are the same, then the ticket is valid. */

import java.util.Scanner;

public class TicketVal

{
   public static void main (String [] args)
{
  Scanner scan = new Scanner (System.in);
  
   int ticket, ticketadj, digit, remainder;

   System.out.println("Enter the six digit ticket number");
   
   ticket = scan.nextInt();

   System.out.println("The ticket number is: " + ticket);

   ticketadj = ticket / 10;
   
   digit = ticket % 10;
   
   remainder = (ticketadj % 7);

   System.out.println("last digit = " + digit);
   
   System.out.println("remainder = " + remainder);
   
     
   if (remainder == digit)
      System.out.println("The ticket number: " + ticket + 
                                 " is valid");
   else
      System.out.println("The ticket number: " + ticket +
                                 " is not valid");
   

 }
} 