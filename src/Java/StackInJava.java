import java.util.Stack;

public class StackInJava {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Welcome");
        stack.push("To");
        stack.push("Newton");
        stack.push("School");
        stack.push("Welcome");
        stack.push("To");
        stack.push("Newton");
        stack.push("School");
        stack.push("Welcome");
        stack.push("Toyutuy");
        stack.push("Newton");
        stack.push("Schooleee");



        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

    }
}