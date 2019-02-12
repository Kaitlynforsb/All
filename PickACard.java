                                      

import java.util.Random;

public class PickACard

{

  enum Suit {Spades, Hearts, Diamonds, Clubs}
   
    enum Rank {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

     
     public static void main (String [] args)
  {  
     
     Random gen = new Random ();
     
       int num, r, s ; 
        
     num = gen.nextInt(52);
     r = num % 13;
     s = num;
     
          
     Suit suit = null;
           
     if (num>=0 && num<=12)
      suit = Suit.Spades;
    else if (num<=25 && num>=13)
      suit = Suit.Hearts;
     else if (num<=38 && num>=26)
      suit = Suit.Diamonds;
     else if (num<=51 && num>=39)
      suit = Suit.Clubs;
     
    
   
   Rank rank = Rank.Ace;
   
     if (r==0)
      rank = Rank.Ace;
     else if (r==1)
      rank = Rank.Two;
     else if (r==2)
      rank = Rank.Three;
     else if (r==3)
      rank = Rank.Four;
     else if (r==4)
      rank = Rank.Five;
     else if (r==5)
      rank = Rank.Six;
     else if (r==6)
      rank = Rank.Seven;
     else if (r==7)
      rank = Rank.Eight;
     else if (r==8)
      rank = Rank.Nine;
     else if (r==9)
      rank = Rank.Ten;
     else if (r==10)
      rank = Rank.Jack;
     else if (r==11)
      rank = Rank.Queen;
     else if (r==12)
      rank = Rank.King; 
      
     
     
     System.out.println("The card is a " + rank + " of " + suit);
    
            
     
     
     
     
     
     
   }
   
}     