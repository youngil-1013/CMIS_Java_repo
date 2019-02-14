public class SongApplication
{
    public static void main(String[] args)
    {
        Song song1 = new Song();
        System.out.println(song1.toString());
        Song song2 = new Song("Soviet Anthem", 222, true);
        System.out.println(song2.toString());
    }
}
