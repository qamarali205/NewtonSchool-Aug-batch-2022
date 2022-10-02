import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Arrayevenaddoddmulti {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];

    for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
    }
     int even = 0, odd = 1;
     
         // Loop to find even, odd 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
        
                odd=odd*arr[i];
            else 
                even+= arr[i];
        }
         System.out.print(even+" "+odd);
            }
}