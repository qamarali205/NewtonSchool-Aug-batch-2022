import java.util.*;

public class Collections {

   // Collection-> List (I)      |  Queue  (I)                   Set (I)             Map(I)

    //            Arraylist      |  PriorityQueue(Heap)         HashSet              HashMap
    //            LinkedList  <- |> Deque (I)                   LinkedHashSet        LinkedHashMap
    //           | Vector        |>  ArrayDeque                 SortedSet (I)        SortedMap(I)
    //           |> Stack                                       TreeSet              TreeMap


    public static void main(String[] args) {
      //  List  -> Ordered Collection of objects, can store duplicates

        List<Integer> list=new ArrayList<>(); // Dynamic Array
        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Abhishek");
        arrayList.add("Rohit");
        arrayList.add("Sneh");
        arrayList.add("Abhishek");

        System.out.println(arrayList.get(2));

        Iterator itr=arrayList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s:arrayList){
            System.out.println(s);
        }

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        // [1,2,3]

        // Can Store Duplicates  // maintain insertion order
        // non synchronized   // can be accessed randomly

        //      ->  [ 4,8,6 ] <-


      //  Non synchronized -It is not-thread safe and can't be shared between
        //  many threads without proper synchronization code.
        //  While, Synchronized- It is thread-safe and can be shared
        //  with many threads. -> 1 thread lock -> lock release , next access



        List<Integer> list1=new LinkedList<>();

        list1.add(5);
        list1.add(7);
        list1.add(3);
        list1.add(7);
        list1.add(7);

        Iterator itr1=list1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        // Doubly Linked List to store the elements
        //can store duplicates
        // maintain insertion order
        // not synchronized
        // faster data manipulation



        List<Integer> list2=new Vector<>();

        // dynamic array, similar to arraylist but synchronized / thread safe

        list2.add(15);
        list2.add(71);
        list2.add(33);
        list2.add(72);
        list2.add(71);

        Iterator itr2=list2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }


        Stack<Integer> list3=new Stack<>();
        list3.push(3);
        list3.push(1);
        list3.push(2);
        list3.push(19);

        Iterator itr3=list3.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println(list3.pop());


                // Interface  -> 3 methods
        //      Class1 -> has to implements
        //      Class2 -> implementing extra 3methods
       // LIFO




       // ---------------
//Queue -> FIFO  order
        Queue<Integer> queue=new PriorityQueue<>(); // Heap
        Queue<Integer> queue1=new ArrayDeque<>();
        Queue<Integer> queue2=new LinkedList<>();


        //Priority Queue - no null values can be stored, priority
        // Deque - Interface - extending Queue

      //  Deque - Doubly ended queue
        // LL AD


        Deque<Integer> deque=new ArrayDeque<>();
        deque.addLast(3);
        deque.addFirst(12);
        deque.addLast(11);


        for(Integer i :deque){
            System.out.println(i);
        }

//---------------------

      //  Set
        // unordered set of elements
        // no duplicates
        // -> null

        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new TreeSet<>();



    }

}