import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {

    // Queue I  -> Dequeue I  -> LinkedList C

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>(); // queue will behave like ll
        queue.add(5);
        queue.add(9);
        queue.add(14);
        queue.add(17);

        System.out.println(queue.remove());

        System.out.println(queue.size());

        System.out.println(queue.peek());
    }

}



//Interface I -> p()


// A    B
// obja   objb



// obja.p() -> A

// objb.p() -> B