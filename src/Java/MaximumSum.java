import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumSum {
    static int maxSubArraySum(int arr[], int n){
        HashMap<Integer, Integer> hm=new HashMap<>();
        int sum=0;
        for(int i=n-1; i>=0; i--){
            sum+=arr[i];
            hm.put(sum,i);
        }
        int pre=0, max=-1;
        for(int i=0; i<n; i++){
            pre+=arr[i];
            if(hm.containsKey(pre) && hm.get(pre)>i)
            {
                if(pre>max){
                    max=pre;
                }
            }
        }
        if(max==-1)
        return 0;
        else
        return max;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
      
      for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }
      System.out.print(maxSubArraySum(arr,n));

    }
}