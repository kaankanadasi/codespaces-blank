package Quiz;

public class Song {
    private String title;
    private String artist;
    private int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds){
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
    public static void main(String[] args) {
        Song ShapeOfYou = new Song("Ed Sheeran", "Shape of You", 235);

        System.out.println("Title: " + ShapeOfYou.title);
        System.out.println("Artist: " + ShapeOfYou.artist);
        System.out.println("Duration In Seconds: " + ShapeOfYou.durationInSeconds);
    }
}