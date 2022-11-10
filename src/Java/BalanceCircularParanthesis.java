import java.util.Scanner;

public class BalanceCircularParanthesis {

    public static  boolean isBalanced(String str){

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                return false;
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bracketExpression = sc.next();
        System.out.println(bracketExpression);

        System.out.println(isBalanced(bracketExpression));
    }
}