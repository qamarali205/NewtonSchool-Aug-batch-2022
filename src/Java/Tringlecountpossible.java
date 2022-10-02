import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static int CountTringle(int arr[], int n){
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<n-2; i++){
            int k = i + 2;
        for (int j = i + 1; j < n; ++j) {
     while (k < n && arr[i] + arr[j] > arr[k])
        ++k;
         if (k > j)
        count += k - j - 1;
            }
        }
        return count;

    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(CountTringle(arr,n));
    }
    }
}