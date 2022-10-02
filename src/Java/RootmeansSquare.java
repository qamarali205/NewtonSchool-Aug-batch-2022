import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      int n;
                      Scanner s=new Scanner(System.in);
                      n=s.nextInt();
                      double x=0;
                      double sum=0;
                      for(int i=0; i<n; i++){
                          x=s.nextDouble();
                          sum+=x*x;
           }
                   sum/=n;
                   sum=Math.sqrt(sum);
                   System.out.printf("%.6f",sum);
    }
}