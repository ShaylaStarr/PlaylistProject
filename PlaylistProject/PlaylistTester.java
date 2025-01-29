/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @Melanie/Shayla
 * @version
 */
public class PlaylistTester{
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist p = new Playlist();
        
        System.out.println("Adding songs to the Playlist...\n");
       
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.addSong ("Promise", "Laufey", 3, 54); 
        p.addSong("New Genesis", "Ado",3, 26 , true); 
        p.addSong ("World Is Mine", "Hatsune Miku", 4, 13, true);
        p.addSong ("Balloon", "Tyler, the Creator", 2, 34);
        p.addSong ("Take Me to the Sun", "D4vd", 2,48);
        p.addSong ("APT", "Rosé & Bruno Mars", 2, 50);
        p.addSong("Unlucky", "Gavis Bettel", 4,15, true);
        p.addSong("30 for 30(with Kendrick Lamar)", "SZA, Kendrick lamar", 4, 38); 
        

         System.out.println("Printing the songs...\n");

        //Print out all the songs in the playlist to verify it's working correctly

        p.displaySong();

        System.out.println("\nLiking the songs in position 2 and 3\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(2);
        p.likeSong(3);

        System.out.println("Printing the songs...\n");
        p.displaySong();

        
        System.out.println("Removing the song in position A, B, C, etc...\n");
        p.badSong(2); 

        System.out.println("Printing the songs...\n");
        p.displaySong(); 

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.likedSongsPlaylist(); 

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        p.duration(); 

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.purgeSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p.displaySong();
    } 

}

