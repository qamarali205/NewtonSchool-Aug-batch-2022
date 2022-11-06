public class Axis extends BankingSystem{

    final double interestRate=7.0;

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