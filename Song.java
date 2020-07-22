
public class Song {//Song Class 

    private String Title;
    private String Artist;
    private String Duration;
    private String Album;
    
      public Song(String Title, String Artist, String Duration, String Album) { // Creating a song 
        this.Title = Title;
        this.Artist = Artist;
        this.Duration = Duration;
        this.Album = Album;
    }
    
    
// ACCESSORS 
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getTitle() { 
        return Title;
    }

    public String getArtist() {
        return Artist;
    }

    public String getDuration() {
        return Duration;
    }

    public String getAlbum() {
        return Album;
    }

}
