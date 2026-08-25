import Service.BookService;
import Service.UserService;
import model.Book;
import model.User;

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

        User user1 = new User("Benjamin" ,"aA1!slkdjf","3080000000");


        UserService user2 = new UserService();
        System.out.println(user2.addUser(user1));
    }}
