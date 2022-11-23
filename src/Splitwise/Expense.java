import java.util.ArrayList;
import java.util.List;

public class Expense {

    //EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL

    String byUserId;// the user who has created/added this expense
    Double amount;
    int numberOfUsersInvolved;
    List<String> userList=new ArrayList<>();
    String expenseType; // equal,percent,exact
    List<Double> numbersToPartition=new ArrayList<>(); // numbers to partition

    //EXPENSE u1 1250 2 u2 u3 EXACT 370 880

    //EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20


//    public Expense(String byUserId, Double amount, int numberOfUsersInvolved, List<User> userList, String expenseType, List<Double> numbersToPartition) {
//        this.byUserId = byUserId;
//        this.amount = amount;
//        this.numberOfUsersInvolved = numberOfUsersInvolved;
//        this.userList = userList;
//        this.expenseType = expenseType;
//        this.numbersToPartition = numbersToPartition;
//    }

    public String getByUserId() {
        return byUserId;
    }

    public void setByUserId(String byUserId) {
        this.byUserId = byUserId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getNumberOfUsersInvolved() {
        return numberOfUsersInvolved;
    }

    public void setNumberOfUsersInvolved(int numberOfUsersInvolved) {
        this.numberOfUsersInvolved = numberOfUsersInvolved;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public List<Double> getNumbersToPartition() {
        return numbersToPartition;
    }

    public void setNumbersToPartition(List<Double> numbersToPartition) {
        this.numbersToPartition = numbersToPartition;
    }
}