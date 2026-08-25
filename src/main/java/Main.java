import bookService.BookService;
import model.Book;

public class Main {

    public static void main(String[] args) {

        BookService bookService = new BookService();


        Book book1 = new Book(
                "karim",
                "Robert Martin",
                5
        );

        Book book2 = new Book(
                "Effective Java",
                "Joshua Bloch",
                3
        );

        Book book3 = new Book(
                "Java: The Complete Reference",
                "Herbert Schildt",
                10
        );

        System.out.println(bookService.addBook(book1));
        System.out.println(bookService.addBook(book2));
        System.out.println(bookService.addBook(book3));

        System.out.println(bookService.removeBook("karim"));


    }
}
