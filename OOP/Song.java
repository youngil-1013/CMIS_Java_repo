public class Song
{
    private String Songname;
    private int Songlength;
    private boolean Songrelease;

    public Song()
    {
        this.Songname = "";
        this.Songlength = 0;
        this.Songrelease = true;
    }

    public Song(String Songname, int Songlength, boolean Songrelease)
    {
        this();
        this.Songname = Songname;
        this.Songlength = Songlength;
        this.Songrelease = Songrelease;
    }

    public String toString()
    {
        return String.format ("Song Name: %s\nSong Length: %d\nSong Release: %b", Songname, Songlength, Songrelease);
    }
}

