public abstract class BankingSystem {

    // User
    int accountNumber;
    int balance;
    String name;
    int loanAmount;


    void withDrawMoney(int money){
        if(balance>=money){
            System.out.println("Money withdrawn");
            balance=balance-money;
        }
        else{
            System.out.println("No balance to withdraw");
        }
    }

    void depositMoney(int money){
        balance=balance+money;
    }

    abstract void getLoan(int money);

    abstract double getInterestRate();
}