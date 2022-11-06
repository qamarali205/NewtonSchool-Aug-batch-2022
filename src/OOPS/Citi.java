public class Citi extends BankingSystem{

    final double interestRate=8.0;

    @Override
    void getLoan(int money) {
        loanAmount+=money ;    // loanamount
        loanAmount+=money*interestRate/100;  // + irate
    }

    @Override
    double getInterestRate() {
        return interestRate;
    }
}