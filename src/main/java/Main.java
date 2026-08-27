import Service.BookService;
import Service.UserService;
import dto.SimpleBook;
import model.Book;
import model.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        UserService userService = new UserService();


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
        Book book4 = new Book(
                "Cyber Hacker",
                "Joshua Bloch",
                15
        );

        System.out.println(bookService.addBook(book1));
        System.out.println(bookService.addBook(book2));
        System.out.println(bookService.addBook(book3));
        System.out.println(bookService.addBook(book4));

        System.out.println(bookService.removeBook("karim"));

        User user1 = new User("Benjamin" ,"aA1!slkdjf","3080000000", LocalDate.now());

        System.out.println(userService.addUser(user1));


        Book [] allBooks = bookService.getAllBooks();
        for (int i = 0; i < allBooks.length; i++) {
            System.out.println(allBooks[i]);

        }

        User [] allUsers = userService.getAllUsers();
        for (int i = 0; i < allUsers.length; i++) {
            System.out.println(allUsers[i]);

        }

        SimpleBook [] allSimpleBooks = bookService.getAllSimpleBooks();
        for (int i = 0; i < allSimpleBooks.length; i++) {
            System.out.println(allSimpleBooks[i]);

        }

        Book [] writebook = bookService.FindBookByWriteNames("Joshua Bloch");
        for (int i = 0; i < writebook.length; i++) {
            System.out.println(writebook[i]);

        }


    }}
