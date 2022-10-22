import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
                      int t=sc.nextInt();
                      while(t-->0){
                      int arrsize=sc.nextInt();
                      int[] arr=new int[arrsize];
                      for(int i=0;i<arrsize;i++){
                          arr[i]=sc.nextInt();
                      }
                      System.out.println(maxCircularSum(arr,arrsize));
                      
                      System.gc();
                      
                      }
    }
    public static int maxCircularSum(int a[], int n)
  {
    if (n == 1)
      return a[0];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    int curr_max = a[0], max_so_far = a[0],
    curr_min = a[0], min_so_far = a[0];
    for (int i = 1; i < n; i++)
    {
      curr_max = Math.max(curr_max + a[i], a[i]);
      max_so_far = Math.max(max_so_far, curr_max);
      curr_min = Math.min(curr_min + a[i], a[i]);
      min_so_far = Math.min(min_so_far, curr_min);
    }
    if (min_so_far == sum) {
      return max_so_far;
    }
    return Math.max(max_so_far, sum - min_so_far);
  }
}