package main;

import pojos.Book;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        var books = new ArrayList<Book>();
        var fileContents = Files.readString(Path.of("books.csv"));

        var lines = fileContents.split("\n");
        for (var line : lines) {
            var cols = line.split(",");
            var book = new Book();
            book.title = cols[1];
            book.authors = cols[2].replace("-", " and ");
            book.averageRating = Double.parseDouble(cols[3]);
            book.numPages = Integer.parseInt(cols[7]);
            books.add(book);
        }

        var keyboard = new Scanner(System.in);
        System.out.printf("Book title search term: ");
        var searchTerm = keyboard.nextLine();
        System.out.printf("Minimum average rating: ");
        var minAvgRating = keyboard.nextDouble();
        for (var book : books) {
            if (book.title.contains(searchTerm) && book.averageRating >= minAvgRating) {
                System.out.println(book.asTableRow());
            }
        }
    }
}
