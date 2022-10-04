import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void diagonalSumMatrix(int mat[][], int n){
        int primary=0;
        int secondary=0;
        for(int i=0; i<n; i++){
            primary+=mat[i][i];
            secondary+=mat[i][n-i-1];
        }
        System.out.print(first+" "+last);
    
    }
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

        diagonalSumMatrix(mat,n);
    }
}