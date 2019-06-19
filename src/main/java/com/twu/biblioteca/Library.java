package main.java.com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private ArrayList<String> menu;
    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private Scanner scanner = new Scanner(System.in);


    public Library(ArrayList<String> menu, ArrayList<Book> books,ArrayList<Movie> movies) {
        this.menu = menu;
        this.books = books;
        this.movies = movies;
    }

    public void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-step-shop for great book titles in Bangalore!");
    }


    public void showMenu() {
        String menuContent = "";
        for (int i = 0; i < this.menu.size(); i++) {
            menuContent += (this.menu.get(i) + "\n");
        }
        System.out.print(menuContent);
    }

    public int selectMenu() {
        System.out.println("Please select the number:");
        String input = scanner.nextLine();
        int id = Integer.parseInt(input);
        if (id < 0 || id > menu.size() -1 ) {
            System.out.println("Please select a valid option!");
            return -1;
        } else {
            return id;
        }
    }

    public void showBookList() {
        String showList = "Title -- Author -- PublishYear\n";
        for (Book book : books) {
            if (book.isAvailable()) {
                showList += book.info();
            }
        }
        System.out.print(showList);
    }

    public boolean checkOutBook() {
        String title = scanner.nextLine().toLowerCase();
        for (Book book : books) {
            if (book.getName().toLowerCase().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Thank you! Enjoy the book!\n");
                return true;
            }
        }
        System.out.println("Sorry, that book is not available.\n");
        return false;
    }

    public boolean returnBook() {
        String title = scanner.nextLine().toLowerCase();
        for (Book book : this.books) {
            if (book.getName().toLowerCase().equals(title)) {
                book.setAvailable(true);
                System.out.println("Thank you for returning the book.\n");
                return true;
            }
        }
        System.out.println("That is not a valid book to return.\n");
        return false;
    }

    public void showMovieList() {
        String showList = "";
        for (Movie movie:movies) {
            if (movie.isAvailable()) {
                showList += movie.info();
            }
        }
        System.out.print(showList);
    }
    public boolean checkOutMovie() {
        String title = scanner.nextLine().toLowerCase();
        for (Movie movie : movies) {
            if (movie.getName().toLowerCase().equals(title) && movie.isAvailable()) {
                movie.setAvailable(false);
                System.out.println("Thank you! Enjoy the movie!\n");
                return true;
            }
        }
        System.out.println("Sorry, that movie is not available.\n");
        return false;
    }

    public boolean returnMovie() {
        String title = scanner.nextLine().toLowerCase();
        for (Movie movie : movies) {
            if (movie.getName().toLowerCase().equals(title)) {
                movie.setAvailable(true);
                System.out.println("Thank you for returning the book.\n");
                return true;
            }
        }
        System.out.println("That is not a valid book to return.\n");
        return false;
    }

    public void close() {
        System.out.println("Bye!");
        System.exit(0);
    }


}