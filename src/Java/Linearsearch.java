import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void LinearSearch(int arr[], int n, int k){
        boolean isFound=false;
        for(int i=0; i<n; i++){
            if(arr[i]==k){
            System.out.print(i+" ");
            isFound=true;
            }  
        }
        if(!isFound)
        System.out.print("Not found");
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
        
        LinearSearch(arr,n,k);
        System.out.println("");
    }
    }
}