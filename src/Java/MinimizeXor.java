import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinimizeXor {
    static int minXOR(int arr[], int n)
    {
        Arrays.parallelSort(arr);
 
        int minXor = Integer.MAX_VALUE;
        int val = 0;
 
        // calculate min xor of consecutive pairs
        for (int i = 0; i < n - 1; i++) {
            val = arr[i] ^ arr[i + 1];
            minXor = Math.min(minXor, val);
        }
 
        return minXor;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
            System.out.print(minXOR(arr, n));
    }
}