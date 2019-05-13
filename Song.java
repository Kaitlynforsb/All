
public class Song
{
   //instance variables
   private String artist, title, album;
   private int track, year;
   
   //constructor to Song object
   public Song (String title, String artist, String album, int track, int year)
 {
   this.artist = artist;
   this.title = title;
   this.album = album;
   this.track = track;
   this.year = year; 
 }


   public String toString()
 {
   String description;
   
   description = String.format("%-20s", title) +
                 String.format("%-20s", artist) +
                 String.format("%-20s", album) +
                 String.format("%-20s", track) +
                 String.format("%-20s", year); 
    
   return description;   
  } 



} //end class