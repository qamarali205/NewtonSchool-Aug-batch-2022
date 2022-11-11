import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

    Queue<Integer> queue=new LinkedList<>();


    // q->         [4] 3 2 1
    public void push(int data){
        queue.add(data);
        int size=queue.size()-1;//n
        while(size-- > 0){
            queue.add(queue.remove());
        }
    }

    public int pop(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.remove();
    }

    public static void main(String[] args) {
        StackUsingOneQueue stack=new StackUsingOneQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());

        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}