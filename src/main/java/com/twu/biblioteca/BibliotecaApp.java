package main.java.com.twu.biblioteca;
import java.util.ArrayList;


public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("1.Show list of all books");
        menu.add("2.Check out a book");
        menu.add("3.Return a book");
        menu.add("4.Show list of all movies");
        menu.add("5.Check out a movie");
        menu.add("6.Return a movie");
        menu.add("0.Exit");

        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Othello", "Shakespeare", "2017");
        Book book2 = new Book("The Old Man and the Sea", "Hemingway", "2018");
        Book book3 = new Book("The Red and the Black", "Stendhal", "2019");
        books.add(book1);
        books.add(book2);
        books.add(book3);

        ArrayList<Movie> movies = new ArrayList<Movie>();
        Movie movie1 = new Movie("Forrest Gump", "Robert Zemeckis", "1994", "USA:PG-13");
        Movie movie2 = new Movie("The Legend of 1900", "Giuseppe Tornatore", "1998", "Rated R");
        Movie movie3 = new Movie("Gone with the Wind", "Victor Fleming", "1939", "USA:Approved");
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        Library library = new Library(menu, books,movies);

        library.welcome();

        while (true) {
            library.showMenu();
            int selectedNum = library.selectMenu();
            switch (selectedNum){
                case 1:
                    library.showBookList();
                    break;
                case 2:
                    System.out.println("Enter the book name you want to check out:");
                    library.checkOutBook();
                    break;
                case 3:
                    System.out.println("Enter the book name you want to return:");
                    library.returnBook();
                    break;
                case 4:
                    library.showMovieList();
                    break;
                case 5:
                    System.out.println("Enter the movie name you want to check out:");
                    library.checkOutMovie();
                    break;
                case 6:
                    System.out.println("Enter the movie name you want to return:");
                    library.returnMovie();
                    break;
                case 0:
                    library.close();
                    break;
                default:break;
            }
        }
    }
}