
public class PlayList
{
   private Song collection [];
   private int count;
   private String artist, title, album;
   private int track, year;

   //constructor sets up initially empty playlist
   public PlayList ()
 {
   collection = new Song[3];
   count = 0;
 }  

   public void addSong (String title, String artist, String album, int track, int year)
 {
   if (count == collection.length)
      increaseSize();
   
   collection[count] = new Song(title, artist, album, track, year);
   count++;
 
 }  


   public String toString()
 {
   String report = "My Playlist: \n";
    
                  
                  
   for (int song = 0; song < count; song++)
         report += collection[song].toString() + "\n";
   
   return report;
 
 } 


   private void increaseSize()
 {
   Song temp [] = new Song[collection.length * 2];
   
   for (int song = 0; song < collection.length; song++)
      temp[song] = collection[song];
      
   collection = temp;
 
 }  




}