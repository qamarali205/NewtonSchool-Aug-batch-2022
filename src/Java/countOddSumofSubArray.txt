import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long countOddSum(int a[], int n) {

        long c_odd = 0, result = 0;

        boolean odd = false;

        for (int i = 0; i < n; i++) {

        if (a[i] % 2 == 1)

        odd = !odd;

        if (odd)

        c_odd++;

        }

        for (int i = 0; i < n; i++) {

        result += c_odd;

        if (a[i] % 2 == 1)

        c_odd = (n - i - c_odd);

        }

        return result;

        }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(countOddSum(arr , n));

        
    }
}