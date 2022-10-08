import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void maxPossSum(int arr[], int n){
        long maxContSum=-1000000;
        long prefSum=0;
        
        for(int i=0; i<n; i++){
            prefSum=prefSum+arr[i];
            if(prefSum>maxContSum){
                maxContSum=prefSum;
            }
            if(prefSum<0){
                prefSum=0;
            }
        }
        System.out.println(maxContSum);
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
           maxPossSum(arr,n);
           
        }
    }
}