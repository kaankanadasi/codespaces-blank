package This;

public class Band {
     //private instance variables - properties of the class
    private String artist;
    private int year;

    //full constructor - all parameters match instance varaibles
    public Band(String artist, int year) {
        this.artist = artist;
        this.year = year;
    }

    //accessor/getter - public, matching type from top
    public String getName() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    //mutator/setter - public void, parameter in parenthesis matches variable from top
    public void SetName(String artist) {
        this.artist = artist;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    public void main(String[] args) {
        Band myBand = new Band("Fleetwood Mac", 1967);

        System.out.println("Artist: "+ myBand.getName() + " Year: " + myBand.getYear());
        /* artist and year are instance variables and cannot be accessed from a static 
        context like the main method. So we should access them by myBand.(accessor()) */ 
    }
}
