import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        long sum=0;        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j+=2){
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
            }
        }
        System.out.print(sum);
    }
}