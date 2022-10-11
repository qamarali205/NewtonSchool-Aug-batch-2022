import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void countSubArraysOddSum(int arr[],int n){
        int sum=0;

        int evenSums=0;
        int oddSums=0;

        long count=0;

        for(int i=0;i<n;i++){
            sum=(sum+arr[i])%2;   // odd or even
            if(sum==1){ // odd
                count = count +1 + evenSums;
            }
            else{ //even
                count =count + oddSums;
            }

            if(sum==1){
                oddSums++;
            }
            else{
                evenSums++;
            }
        }

        System.out.println(count);
    }

    public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
             }

            countSubArraysOddSum(arr,n);
    }
}