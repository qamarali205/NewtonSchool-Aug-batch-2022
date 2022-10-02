import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Hashingpair {
    static boolean checkpair(int arr[], int n, int x){
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        if(checkpair(arr,n,x)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
    }
}