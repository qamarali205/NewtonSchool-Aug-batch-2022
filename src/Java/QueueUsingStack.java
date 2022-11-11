import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    // dequeue cheaper


    public void enqueue(int data){
        // moving elements from s1 to s2
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(data);// pushing the element to s1
        // moving elements from s2 to s1 back
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int dequeue(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }


    public static void main(String[] args) {
        QueueUsingStack queue=new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());

        queue.enqueue(5);

        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}