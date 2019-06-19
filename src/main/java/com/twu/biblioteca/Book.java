package main.java.com.twu.biblioteca;

public class Book{
    private String title;
    private String author;
    private String year;
    private boolean isAvailable = true;
    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String info() {
        String text = title + "--"+ author + "--"+ year +"\n";
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
