import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {

    public static  boolean isBalanced(String str) {
        Stack<Character> stack=new Stack<>();
        // {()}

        // }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);   // [   ( ) [ ] { }  ]
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
                continue;
            }
            // closing character
            if(stack.isEmpty()){
                return false;
            }
// c- closing
            // opening top of stack
            char poppedChar=stack.pop(); // [  ([{ ]

            switch(c){
                case ')':
                    if(poppedChar!='('){
                        return false;
                    }
                    break;

                case ']':
                    if(poppedChar!='['){
                        return false;
                    }
                    break;

                case '}':
                    if(poppedChar!='{'){
                        return false;
                    }
                    break;

            }
            // c- ]   [
            // c- )    (
            // c- }    {

        }

//
        return stack.isEmpty();
    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bracketExpression = sc.next();
        System.out.println(bracketExpression);

        System.out.println(isBalanced(bracketExpression));
    }
}