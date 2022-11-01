import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void findPair(int arr[], int n){
        if (n < 2) {
            return;
        }
        Arrays.sort(arr);

        int l = 0;
        int r = n- 1;
 
        
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
 
       
        while (l < r)
        {
           if (Math.abs(arr[r] + arr[l]) < min)
            {
                min = Math.abs(arr[r] + arr[l]);
                i = l;
                j = r;
            }
 
            
            if (min == 0) {
                break;
            }
 
            if (arr[r] +arr[l] < 0) {
                l++;
            }
            else {
                r--;
            }
        }
 
        
        System.out.print(arr[i]+arr[j]);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findPair(arr,n);
    }
}