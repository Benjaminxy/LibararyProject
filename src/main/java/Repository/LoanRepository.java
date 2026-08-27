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
}