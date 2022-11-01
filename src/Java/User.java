package Bank;
import java.util.*;
public class User {
    Account user1=new Account();
    user1.setAccountNumber(23146975);
    user1.setAmount(13545);
    user1.depositeMoney(123654);
    user1.withdrawMoney(53652);
    user1.transferMoney(25874136, 2536);

    user1.getAccountNumber();
    user1.getAmount();

}