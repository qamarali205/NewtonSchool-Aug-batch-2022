import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr[][]=new int[n][m];;

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=0; j<m; j++){
            if(arr[i][j]>0)
        count++;
        
     }
    
    }
    System.out.print(count);
    }
}