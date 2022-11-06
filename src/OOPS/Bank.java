import java.util.*;
public class Bank {

    public static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.depositMoney(10000);
        sbi.withDrawMoney(200);
        System.out.println(sbi.balance);

        PNB pnb=new PNB();
        pnb.depositMoney(100001);
        System.out.println(pnb.balance);

        Axis axis=new Axis();
        axis.getLoan(50000);
        System.out.println(axis.interestRate);
        System.out.println(axis.loanAmount);

        Citi citi=new Citi();
        citi.getLoan(100000);
        System.out.println(citi.interestRate);
        System.out.println(citi.loanAmount);



        BankingSystem bs=new PNB();
        bs.depositMoney(200000);
        System.out.println(bs.balance);

    }
}