mport java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void SlidingMax(int arr[], int N, int K)
    {
 
        Deque<Integer> Q = new LinkedList<Integer>();
 
        int i;
        for (i = 0; i < K; ++i) {
            while (!Q.isEmpty() && arr[i] >= arr[Q.peekLast()])
 
            Q.removeLast();
 
            Q.addLast(i);
        }
        for (; i < N; ++i) {
            System.out.print(arr[Q.peek()] + " ");

            while ((!Q.isEmpty()) && Q.peek() <= i - K)
                    Q.removeFirst();

            while ((!Q.isEmpty()) && arr[i] >= arr[Q.peekLast()])
                Q.removeLast();
 
            Q.addLast(i);
        }

        System.out.print(arr[Q.peek()]);
    }

    public static void main (String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n;i++)
            a[i]=sc.nextInt();
        int k = sc.nextInt();
        SlidingMax(a,n,k);
    }

}