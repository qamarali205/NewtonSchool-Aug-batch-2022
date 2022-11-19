import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static long maxproduct(int[] arr, int n, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        // insert till k 
        for (int i = 0; i< k; i++) {
            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        long ans = arr[dq.getFirst()];
        for ( int i  = k; i<n; i++) {
            
            if (dq.getFirst() == i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            ans = (ans * arr[dq.getFirst()]) % 1000000007;
        }
        return ans % 1000000007;
    }
    public static void main (String[] args) {

        Scanner str = new Scanner(System.in);
        String num2[] = str.nextLine().split(" ");
        int n = Integer.parseInt(num2[0]);
        int k = Integer.parseInt(num2[1]);
        String nums[] = str.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0;i <n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        System.out.print(maxproduct(arr, n, k));
    }

   
}*****************