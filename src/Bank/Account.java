package Bank;

public class Account {
    private int accountNumber;
    private int amount;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void depositeMoney(int n){
        amount+=n;
    }
    public void withdrawMoney(int n){
        amount-=n;
    }
    public void transferMoney(int accountNumber, int money){

    }
}