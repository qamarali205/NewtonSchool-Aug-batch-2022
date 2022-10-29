import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MedianTwosortedArrays {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        //input array 1
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // input array 2
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int n1 = n+m;
        int[] arr = new int[n1];
        int j = 0;
        for (int i = 0; i < n1; i++) {
            if (i < n) 
                arr[i] = arr1[i];
            else
                arr[i] = arr2[j++];
        }
        int x = 0;
        Arrays.sort(arr);
        double res = 0;
        if (arr.length%2 == 0) {
            x = arr.length/2;
            res = (arr[x]+arr[x-1]);
            res /= 2;
        }
        else res = arr[arr.length/2];

        System.out.printf("%.2f", res);

        
    }
}