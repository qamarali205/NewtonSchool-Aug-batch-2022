// your code goes here
class BankAccount{
    int balance;
    String name;

     BankAccount(int a,String str){
        balance = a;
        name=str;
    }

    public void depositFund(int b){
        this.balance = this.balance+b;

    }
    public boolean withdrawFund(int f){
        if(this.balance-f<0){
            return false;
        }
        else{
            this.balance = this.balance-f;
            return true;
        }

    }
}