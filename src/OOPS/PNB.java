public class PNB extends BankingSystem{

    final double interestRate=6.9;

    @Override
    void getLoan(int money) {
        loanAmount+=money ;    // loanamount
        loanAmount+=money*7/100;  // + irate
    }

    @Override
    double getInterestRate() {
        return interestRate;
    }

    void depositMoney(int money){
        if(money>100000) {
            balance = balance + money + 1000;
        }
        else{
            balance = balance + money;
        }
    }
}