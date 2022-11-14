import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void printKMax(int arr[], int N, int K)
    {
       Deque<Integer> Qi = new LinkedList<Integer>();
 
        int i;
        for (i = 0; i < K; ++i) {
 
            while (!Qi.isEmpty()
                   && arr[i] >= arr[Qi.peekLast()])
 
                Qi.removeLast();
 
            Qi.addLast(i);
        }
 
        for (; i < N; ++i) {
 
            System.out.print(arr[Qi.peek()] + " ");
 
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();
 
            
            while ((!Qi.isEmpty())
                   && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
 
            Qi.addLast(i);
        }
 
        System.out.print(arr[Qi.peek()]);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
                printKMax(arr, arr.length, k);

    }
}