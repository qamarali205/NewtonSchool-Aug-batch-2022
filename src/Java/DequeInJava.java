import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
//   <- ->[  3 6 7       ]<-   ->
//     f         l
public class DequeInJava {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();

        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);
        deque.addFirst(3);
        deque.addFirst(1);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque.isEmpty());

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

    }

}