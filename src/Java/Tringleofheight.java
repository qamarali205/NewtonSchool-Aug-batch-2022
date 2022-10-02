import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Tringleofheight {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
                      int i, j, n;
                      n=sc.nextInt();
                      for(i=0; i<n; i++){
                          for(j=0; j<=i; j++)
                          {
                              System.out.print("*");
                          }
                          System.out.println();   

                      }
    }
}
// for(int i=1; i<=5; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*"+" ");
//     }
//     System.out.println();
// }