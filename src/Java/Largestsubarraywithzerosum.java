import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int maxLen(int arr[], int n)
    {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
 
        int sum = 0; // Initialize sum of elements
        int max_len = -1; // Initialize result
 
        // Traverse through the given array
        for (int i = 0; i < n; i++) {
            // Add current element to sum
            sum += arr[i];
 
            if (arr[i] == 0 && max_len == 0)
                max_len = 1;
 
            if (sum == 0)
                max_len = i + 1;
 
            // Look this sum in hash table
            Integer prev_i = hM.get(sum);
 
            // If this sum is seen before, then update
            // max_len if required
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else // Else put this sum in hash table
                hM.put(sum, i);
        }
 
        return max_len;
    }
    public static void main (String[] args) {
                      // Your code here
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];

      for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }
        System.out.print(maxLen(arr,n));
        
    }        
}