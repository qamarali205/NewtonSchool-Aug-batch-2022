import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[][]=new int[n][n];
for(int i=0;i<n; i++){
    for(int j=0; j<n; j++){
        arr[i][j]=sc.nextInt();
    }
}
    
//creating another matrix to store transpose of a matrix  
int transpose[][]=new int[n][n];   
    
//Code to transpose a matrix  
for(int i=0;i<n;i++){    
for(int j=0;j<n;j++){    
transpose[i][j]=arr[j][i];  
}    
}    
   
for(int i=0;i<n;i++){    
for(int j=0;j<n;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();//new line    
}    
}
}