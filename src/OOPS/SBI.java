public class SBI extends BankingSystem{

    final double interestRate=7.0;

    @Override
    void getLoan(int money) {
        loanAmount+=money ;    // loanamount
        loanAmount+=money*7/100;  // + irate
    }

    @Override
    double getInterestRate() {
        return interestRate;
    }
}