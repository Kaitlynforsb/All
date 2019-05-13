
import java.util.Scanner;

public class SongDriver
{
   public static void main (String [] args)
 {
   int input;
   String titles, artists, albums, song;
   int tracks;
   int years;
   
   Scanner scan = new Scanner (System.in);
   
   PlayList songs = new PlayList();
   
   System.out.println("How many songs for this playlist? ");
   
   input = scan.nextInt();
   
   for (int i = 0; i < input; i++)
  {
      scan.nextLine();
      System.out.println("Enter the following data for Song " + (i+1));
      System.out.println("Song Title: ");
      titles = scan.nextLine();
      System.out.println("Artist: ");
      artists = scan.nextLine();
      System.out.println("Album: ");
      albums = scan.nextLine();
      System.out.println("Track number: ");
      tracks = scan.nextInt();
      System.out.println("Year released: ");
      years = scan.nextInt();
  
    songs.addSong(titles, artists, albums, tracks, years);
  
  }     
   
   System.out.println(songs);
 
 
 
 
 
 }  //end main
} //end class