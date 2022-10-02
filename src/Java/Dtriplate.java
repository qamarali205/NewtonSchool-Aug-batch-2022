import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt(); 
    int arr[]=new int[n];
       long count=0;
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int i=0, j=i+2, k=n;
    while(j<k){
        if(j<i+2) j=i+2;
        while(j<k && arr[j]-arr[i]<=p){
            count+=j-i-1;
            j++;
        }
        i++;
        j=i+2;
    }
    // for(int i=0; i<n; i++){
    //     for(int j=i+1; j<n; j++){
    //         for(int k=j+1; k<n; k++){
    //             if(Math.abs(arr[i]-arr[j])<=p && Math.abs(arr[j]-arr[k])<=p && Math.abs(arr[i]-arr[k])<=p){
    //             count++;
    //             }
    //         }
    //     }
    // }
    System.out.print(count);
        

    }
}