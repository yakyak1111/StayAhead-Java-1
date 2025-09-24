package Main;

import pojos.LibraryBook;

public class App {
    public static void main(String[] args) {

            var book1 = new LibraryBook();
            book1.title = "Java for Dummies";
            book1.author = "Any Body";
            System.out.println (book1.title);
            System.out.println(book1.author);}

}
