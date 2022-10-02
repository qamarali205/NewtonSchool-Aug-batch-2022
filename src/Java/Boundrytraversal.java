
    import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Boundrytraversal {
    public static void main (String[] args) {
                      // Your code here
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int m=sc.nextInt();
int arr[][]=new int[n][m];

for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
        arr[i][j]=sc.nextInt();
    }
}
    boundaryTraversal(arr,n,m);
    System.out.println();
}
    }

 public static void boundaryTraversal(int arr[][], int n, int m){


    //first row
    for(int i=0; i<m; i++){
        System.out.print(arr[0][i]+" ");
    }
    // last Col
    for(int i=1; i<n; i++){
        System.out.print(arr[i][m-1]+" ");
    }
    //last row
    if(n>1){
    for(int i=m-2; i>=0; i--){
        System.out.print(arr[n-1][i]+" ");
    }
    }
    if(m>1){
    // first col
    for(int i=n-2; i>=1; i--){
        System.out.print(arr[i][0]+" ");
    }
    }
    
 }
    
}
