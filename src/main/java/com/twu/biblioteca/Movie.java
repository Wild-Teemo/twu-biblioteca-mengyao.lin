package main.java.com.twu.biblioteca;

public class Movie{
    private String title;
    private String year;
    private String director;
    private String rating;
    private boolean isAvailable = true;
    public Movie(String title, String director, String year,String rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }
    public String info() {
        String text = "Title:"+title + ", Director:"+ director + ", Year:"+ year +", Rating:"+ rating+"\n";
        return text;
    }

    public String getName() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
