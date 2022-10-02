import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int mat[][]=new int[n][n];

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            mat[i][j]=sc.nextInt();
        }
    }
   /// rotate 90 degree


            
        for (int j = 0; j<n; j++)
        {
            for (int i=n-1; i >= 0; i--)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        } 
    
        System.out.println();
   
   for(int i=n-1; i>=0; i--){
        for(int j=n-1; j>=0; j--){
            System.out.print(mat[i][j]+" ");
                        
        }
        System.out.println();
    }
    }

}