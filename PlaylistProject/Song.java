/**
 * The Song class describes the song in terms of its time in minutes and seconds, its name, and weither it is liked or not
 * 
 * @Authors: Shayla Starr and Melanie Zhou
 * @Date: 1/24/25
 */


 public class Song {
    private String name;
    private int min;
    private int sec;
    private boolean liked;
    private String artist;

    /**
     * Constructor
     */
    public String toString(){
        return "Song: '" + name + "' by " + artist + " (" + min + ":" + sec + ") - " + (liked ? "Liked" : "Not Liked");

    }
    public Song(String NAME,String ARTIST, int MIN, int SEC, boolean LIKED)
    {
        name = NAME;
        artist= ARTIST;
        min= MIN;
        sec = SEC;
        liked= LIKED;
    } 
    public Song(String NAME,String ARTIST, int MIN, int SEC)
    {
        name = NAME;
        artist= ARTIST;
        min= MIN;
        sec = SEC;
        liked = false;
    } 
    public String getName()
    {
        return name;
    }
    public String getArtist()
    {
        return artist;
    }
    public int getMin()
    {
        return min;
    }
    public int getSec()
    {
        return sec;
    }
    public boolean getLiked()
    {
        return liked;
    }
    
    public void toggleLiked()
    {
        if (liked)
        {
            liked = false;
        }
        else 
        { 
            liked = true;
        }
    }


}
