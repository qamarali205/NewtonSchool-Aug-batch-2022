import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void search(int arr[], int n,int k){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]<=k){
                count++;
                
            }
        }
        if(count!=0){
            System.out.println(--count);
        }else{
            System.out.println(-1);
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            search(arr,n,k);

        }
        
    }
}