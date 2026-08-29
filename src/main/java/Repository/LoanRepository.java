package Repository;

import model.Loan;

public class LoanRepository {
   private static final Loan [] loans = new Loan[100];
   private static int size;

   public int countOfLoanBookByTitle(String title)
   {

       int count= 0;
       for (int i = 0; i < size; i++) {
           if(loans[i] != null && loans[i].getBookTitle().equals(title)){

                count++;

           }

       }
       return count;


   }

public void save(Loan loan) {
    for (int i = 0; i < loans.length; i++) {
        if (loans[i] == null) {
           ++size;
            loans[i] = loan;
            break;
        }
    }
}

    public boolean removeLoan(String nationalCode, String bookTitle) {
        for (int i = 0; i < size; i++) {
            if (loans[i] != null
                    && loans[i].getNationalCode().equals(nationalCode)
                    && loans[i].getBookTitle().equals(bookTitle)) {

                for (int j = i; j < size - 1; j++) {
                    loans[j] = loans[j + 1];
                }
                loans[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}