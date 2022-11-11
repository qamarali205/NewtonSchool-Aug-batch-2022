import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public void push(int data){
        q2.add(data);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        //int temp=a;
       // a=b
         //       b=temp
// swapping ,or  q2->q1
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }

    public int pop(){

        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.remove();

    }


    public static void main(String[] args) {
        StackUsingQueue stack =new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());

        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop()); 
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }

}