import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SquaresortArray {

    static void Sortsquare(int arr[], int n){
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
 
        // Sort an array using "inbuild sort function"
        // in Arrays class.
        Arrays.sort(arr);
    }
    
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
    
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0; i<n; i++){
              arr[i]=sc.nextInt();
          }
           Sortsquare(arr,n);
         for (int i = 0; i < n; i++)
             System.out.print(arr[i] + " ");
             System.out.println("");
      }
}
    }