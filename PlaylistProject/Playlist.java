import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
        ArrayList <Song> NorPlaylist; 
     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        NorPlaylist = new ArrayList<Song>(); 

    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void addSong(String name, String artist, int min, int sec, boolean liked){
        Song s1 = new Song (name, artist, min, sec, liked); 

      }

      public void addSong(String name, String artist, int min, int sec){
        Song s2 = new Song(name, artist, min, sec); 
      }

     /*  public Song printSongs(Song NorPlaylist){
        return NorPlaylist; 
      }

       public Song likeSong(Song NorPlaylist){
        
        if(NorPlaylist.getLiked() == false){
            
            NorPlaylist.toggleLiked(); 
        } 
        public displaySong(){
            for(Song song : NorPlaylist){
                song.add()

            }
        }
    }


       } 

       public void addSong(ArrayList NorPlaylist){
        NorPlaylist
       

       } */ 


}

