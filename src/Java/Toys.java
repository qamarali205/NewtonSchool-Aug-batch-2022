import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<q; i++){
            int k = sc.nextInt();
            int start = 0;
            int end = n-1;
            int min_res_to_buy = 0;
            while(end >= start){
                min_res_to_buy += arr[start];
                start++;
                end -= k;
            }
            System.out.println(min_res_to_buy);
        }
        

    }
}