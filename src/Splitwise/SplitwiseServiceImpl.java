
import Splitwise.Expense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class SplitwiseServiceImpl implements SplitwiseService{

    Map<String, Map<String,Double>>  userIdToOwedPeopleMap =new HashMap<>();

//    u1 - [u2-300]   // u2 has to pay 300 rs to u1
//         [u3-500]
//         [u4-350]
//
//    u2 - [u1-400]
//         [u3-200]
//         [u4-550]
//
//    u3 - [u1-600]
//         [u2-400]
//         [u4-150]
//
//    u4 - [u1-900]
//         [u2-500]
//         [u2-4050]

    public void addExpense(Expense expense) {

        Double paidAmount = expense.getAmount();
        List<Double> amountsDistributed=new ArrayList<>();

        if(expense.getExpenseType().equals("EQUAL")){
            Double individualAmount = paidAmount/expense.getNumberOfUsersInvolved();
            for(int i=0;i<expense.getNumberOfUsersInvolved();i++){
                amountsDistributed.add(individualAmount);
            }
            hydrateMap(expense,amountsDistributed);
        }

        else if(expense.getExpenseType().equals("EXACT")) {
            Double sum = 0.0;
            for (int i = 0; i < expense.getNumbersToPartition().size(); i++) {
                sum += expense.getNumbersToPartition().get(i);
            }
            if (!paidAmount.equals(sum)) {
                System.out.println(sum);
                System.out.println(paidAmount);
                System.out.println("Invalid Input");
                return;
            }

            for (int i = 0; i < expense.getNumberOfUsersInvolved(); i++) {
                amountsDistributed.add(expense.getNumbersToPartition().get(i));
            }

            hydrateMap(expense, amountsDistributed);
        }

        else if(expense.getExpenseType().equals("PERCENT")){
            int percent=0;
            for(int i=0;i<expense.getNumbersToPartition().size();i++){
                percent+=expense.getNumbersToPartition().get(i);
            }
            if(!(percent==100)){
                System.out.println("Invalid Input");
                return;
            }

            for(int i=0;i<expense.getNumberOfUsersInvolved();i++){
                amountsDistributed.add(paidAmount*expense.getNumbersToPartition().get(i)/100);
            }

            hydrateMap(expense,amountsDistributed);
        }
    }

    public void hydrateMap(Expense  expense, List<Double> amountsDistributed){
        String paidId=expense.getByUserId();
        if(userIdToOwedPeopleMap.containsKey(paidId)){
            Map<String,Double> owedMap=userIdToOwedPeopleMap.get(paidId);

            for(int i=0;i<expense.getNumberOfUsersInvolved();i++){

                if(!expense.getUserList().get(i).equals(expense.getByUserId())) {

                    if(owedMap.containsKey(expense.getUserList().get(i))) {
                        Double oldAmount=owedMap.get(expense.getUserList().get(i));
                        owedMap.put(expense.getUserList().get(i),  oldAmount+amountsDistributed.get(i));
                    }
                    else {
                        owedMap.put(expense.getUserList().get(i), amountsDistributed.get(i));
                    }

                }
            }

            userIdToOwedPeopleMap.put(paidId, owedMap);
        }
        else{
            Map<String,Double> owedMap=new HashMap<>();

            for(int i=0;i<expense.getNumberOfUsersInvolved();i++){
                if(!expense.getUserList().get(i).equals(expense.getByUserId())) {
                    owedMap.put(expense.getUserList().get(i), amountsDistributed.get(i));
                }
            }
            userIdToOwedPeopleMap.put(paidId, owedMap);

        }
    }


    //{u1= {u2=650.0, u3=1350.0, u4=500.0},
    // u2= {u1=266.6666666666667, u3=1066.6666666666667, u4=666.6666666666667},
    // u4= {u1=480.0, u2=240.0, u3=240.0}}

    public void show() {
        if(!userIdToOwedPeopleMap.isEmpty()){
            userIdToOwedPeopleMap.forEach((k,v) -> {
                v.forEach((k1,v1) -> System.out.println(k1 + " owes "+ v1 + " amount to " +k));
            });
        }
        else{
            System.out.println("No expense details");
        }
        System.out.println();
    }

    public void show(String userId) {

        AtomicBoolean expensesAreThere = new AtomicBoolean(false);

        Map<String ,Double> getMoney=userIdToOwedPeopleMap.get(userId);
        // other users has to pay userid
        if(getMoney!=null){
            expensesAreThere.set(true);
            getMoney.forEach((k,v) ->
                    System.out.println(k + " owes "+ v + " amount to " +userId));
        }

        // userid has to pay to other users

        if(!userIdToOwedPeopleMap.isEmpty()){
            userIdToOwedPeopleMap.forEach((k,v) -> {
                if(!k.equals(userId)) {
                    if(v.containsKey(userId)){
                        expensesAreThere.set(true);
                        System.out.println(userId + " owes "+ v.get(userId) + " amount to " +k);
                    }
                }
            });
        }

        if(!expensesAreThere.get()){
            System.out.println("No expense details");
        }
        System.out.println();
    }
}