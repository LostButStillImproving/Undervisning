package loanClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class LoanTest {

    @Test
    public void testDefaultConstructor() {
        Loan defaultLoan = new Loan();

        Assertions.assertEquals(2.5, defaultLoan.getAnnualInterestRate());
        Assertions.assertEquals(1, defaultLoan.getNumberOfYears());
        Assertions.assertEquals(1000, defaultLoan.getLoanAmount());

    }

    @Test
    public void testSetLoanAmount() {
        Loan defaultLoan = new Loan();
        defaultLoan.setLoanAmount(100);
        Assertions.assertEquals(100, defaultLoan.getLoanAmount());
    }

    @Test
    public void testNegativeLoan() {
        Loan negativeLoan = new Loan(2.5, 10, -100);
        Assertions.assertEquals(-100, negativeLoan.getLoanAmount());
    }

    @Test
    public void testLoanDate() {
        Loan loan = new Loan();
        int today = LocalDate.now().getDayOfMonth();
        String actualDate = loan.getLoanDate().toString().split(" ")[2];
        if (actualDate.startsWith("0")) {
             actualDate = actualDate.replaceFirst("0", "");
        }
        Assertions.assertEquals(today, Integer.parseInt(actualDate));
    }
}