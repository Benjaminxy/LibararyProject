package model;

import java.time.LocalDate;

public class Loan {
    private String nationalCode;
    private String bookTitle;
    private LocalDate loanDate;

    public Loan(String nationalCode, String bookTitle, LocalDate loanDate) {
        this.nationalCode = nationalCode;
        this.bookTitle = bookTitle;
        this.loanDate = loanDate;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }
}
