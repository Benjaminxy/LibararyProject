package Repository;

import model.Loan;

public class LoanRepository {
   private static final Loan [] loans = new Loan[100];
   private static int size;

public void save(Loan loan) {
    for (int i = 0; i < loans.length; i++) {
        if (loans[i] == null) {
            size++;
            loans[i] = loan;
            break;
        }
    }
}
}