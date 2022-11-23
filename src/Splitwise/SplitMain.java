import Splitwise.Expense;
import Splitwise.User;
import Splitwise.SplitwiseServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SplitMain {   // Splitwise

    public static void main(String[] args) {
        SplitwiseServiceImpl splitwiseService=new SplitwiseServiceImpl();

        User raunak=new User("u1","Raunak","raunak@gmail.com"
        , "2893372109","M");

        User vivek=new User("u2","Vivek","vivek@gmail.com"
                , "23432","M");

        User abhishek=new User("u3","Abhishek","abhi@gmail.com"
                , "57566546","M");

        User prajakta=new User("u4","Prajakta","prajak@gmail.com"
                , "4234434","F");


        String expenseInput1= "EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL";
        Expense expense1=filterInput(expenseInput1);
        splitwiseService.addExpense(expense1);
        splitwiseService.show();
        splitwiseService.show("u2");

        String expenseInput2= "EXPENSE u1 1250 2 u2 u3 EXACT 400 850";



        String expenseInput3= "EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20";


    }

    public static  Expense filterInput(String input){
        Expense expense=new Expense();

//   byUserId;amount;numberOfUsersInvolved;
//   userListexpenseType;numbersToPartition

        String[] partition=input.split(" ");
        int i=1;
        expense.setByUserId(partition[i]);
        expense.setAmount(Double.parseDouble(partition[++i]));
        expense.setNumberOfUsersInvolved(Integer.parseInt(partition[++i]));

        for(int j=0;j<expense.getNumberOfUsersInvolved();j++){
            expense.getUserList().add(partition[++i]);
        }

        expense.setExpenseType(partition[++i]);

// set numbers of partition
        //  10
        // 7   8 yo 10
        for(int j=++i;j< partition.length;j++){
            expense.getNumbersToPartition().add(Double.parseDouble(partition[j]));
        }

        return expense;
    }



}