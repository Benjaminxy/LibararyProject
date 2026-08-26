package Repository;

import model.Loan;

public class LoanRepository {
    Loan [] loans = new Loan[100];

public void save(Loan loan) {
    for (int i = 0; i < loans.length; i++) {
        if (loans[i] == null) {
            loans[i] = loan;
            break;
        }
    }
}
}