import Service.BookService;
import Service.LoanService;
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
        printSection("All Books", allBooks);

        User [] allUsers = userService.getAllUsers();
        printSection("All Users", allUsers);

        SimpleBook [] allSimpleBooks = bookService.getAllSimpleBooks();
        printSection("All Simple Books", allSimpleBooks);

        Book [] booksByWriter = bookService.findBooksByWriterName("Joshua Bloch");
        printSection("Books by Joshua Bloch", booksByWriter);

        LoanService loanService = new LoanService();

        // "Effective Java" has quantity 3, so the 4th loan of it should fail
        for (int i = 1; i <= 4; i++) {
            boolean loaned = loanService.loanBook("Effective Java", user1.getNationalCode());
            System.out.println("Loan attempt " + i + " for 'Effective Java': " + loaned);
        }

        // book title that doesn't exist  exposes the missing null check in LoanService
        boolean loanedMissingBook = loanService.loanBook("Not A Real Book", user1.getNationalCode());
        System.out.println("Loan attempt for missing book: " + loanedMissingBook);
    }

    private static void printSection(String title, Object[] items) {
        System.out.println("\n-- " + title + " --");
        for (Object item : items) {
            System.out.println(item);
        }
    }


}
