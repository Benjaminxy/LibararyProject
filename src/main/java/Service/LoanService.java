package Service;

import Repository.BookRepository;
import Repository.LoanRepository;
import model.Book;
import model.Loan;
import model.User;

import java.time.LocalDate;

public class LoanService {
private final LoanRepository loanRepository = new LoanRepository();

BookService bookService = new BookService();
    public boolean loanBook(String bookTitle, String nationalCode) {

        int countOfLoan = loanRepository.countOfLoanBookByTitle(bookTitle);
        Book book =bookService.getBookByTitle(bookTitle);
        if (book == null) {

            return false ;
        }
        if (countOfLoan == book.getQuantity()) {
            return false;

        }

        Loan loan = new Loan(nationalCode, bookTitle, LocalDate.now().minusDays(15));
        loanRepository.save(loan);
        return  true ;

    }

    public boolean returnBook(String bookTitle, String nationalCode) {
        return loanRepository.removeLoan(nationalCode, bookTitle);
    }
}
