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

        String expenseInput4= "EXPENSE u2 800 3 u1 u3 u4 EQUAL";
        Expense expense4=filterInput(expenseInput4);
        splitwiseService.addExpense(expense4);
        splitwiseService.show();


        String expenseInput5= "EXPENSE u1 500 2 u3 u4 EQUAL";
        Expense expense5=filterInput(expenseInput5);
        splitwiseService.addExpense(expense5);
        splitwiseService.show();

        String expenseInput2= "EXPENSE u1 1250 2 u2 u3 EXACT 400 850";
        Expense expense2=filterInput(expenseInput2);
        splitwiseService.addExpense(expense2);
        splitwiseService.show();

        String expenseInput3= "EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20";
        Expense expense3=filterInput(expenseInput3);
        splitwiseService.addExpense(expense3);
        splitwiseService.show();

        String expenseInput6= "EXPENSE u2 2000 3 u2 u3 u4 PERCENT 40 40 20";
        Expense expense6=filterInput(expenseInput6);
        splitwiseService.addExpense(expense6);
        splitwiseService.show();

        
//        u1= {u2=650.0,
//                u3=1350.0,
//                u4=500.0}
//
//        u2= {u1=266.6666666666667,
//                u3=1066.6666666666667,
//                u4=666.6666666666667}
//
//        u4= {u1=480.0,
//                u2=240.0,
//                u3=240.0}


        splitwiseService.show("u2");


    }

    public static  Expense filterInput(String input){
        Expense expense=new Expense();

        String[] partition=input.split(" ");
        int i=1;
        expense.setByUserId(partition[i]);
        expense.setAmount(Double.parseDouble(partition[++i]));
        expense.setNumberOfUsersInvolved(Integer.parseInt(partition[++i]));

        for(int j=0;j<expense.getNumberOfUsersInvolved();j++){
            expense.getUserList().add(partition[++i]);
        }

        expense.setExpenseType(partition[++i]);

        for(int j=++i;j< partition.length;j++){
            expense.getNumbersToPartition().add(Double.parseDouble(partition[j]));
        }

        return expense;
    }



}