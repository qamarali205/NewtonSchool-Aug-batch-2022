import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       
       Scanner sc= new Scanner(System.in);
       long sum=0;
       int N=sc.nextInt();
       for(int i=1; i<=N; i++)
       {
           int n=sc.nextInt();
           sum+=(N-i)^n;
       }
       System.out.print(sum);
    }
}