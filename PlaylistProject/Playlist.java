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
       private ArrayList<Song> norPlaylist; 
     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        norPlaylist = new ArrayList<Song>(); 

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
        norPlaylist.add(new Song(name, artist, min, sec, liked)); 

      }
      
      public void addSong(String name, String artist, int min, int sec){
        norPlaylist.add(new Song (name, artist, min, sec)); 
      }

     
      /* Like/Unlike Song */
       public void likeSong(int position){
        
        if(norPlaylist.get(position).getLiked() == false){
            
            norPlaylist.get(position).toggleLiked();
            System.out.println("Liking song in position " + position);
        }
        else
        {
          norPlaylist.get(position).toggleLiked();
            System.out.println("Unliking song in position " + position);
        }
      } 
     
        /* Display List */
        public void displaySong(){
            for(int i = 0; i<norPlaylist.size(); i++){
                if (norPlaylist.get(i).getLiked() == true) {
              System.out.println(" '' " + (norPlaylist.get(i).getName())+ " '' "  + " by " +(norPlaylist.get(i).getArtist()) + " " +
                                    (norPlaylist.get(i).getMin())+ ":" + (norPlaylist.get(i).getSec())+"-- Liked");
                }
                else
                {
                  System.out.println(" '' " + (norPlaylist.get(i).getName())+ " '' "  + " by " +(norPlaylist.get(i).getArtist()) + " " +
                                    (norPlaylist.get(i).getMin())+ ":" + (norPlaylist.get(i).getSec()));
                }

            }
        }
    }


/* 
       

       }


}
*/
