import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static void bin(long n)
    {
        if (n > 1)
            bin(n >> 1);
 
        System.out.printf("%d", n & 1);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        bin(n);
    }
}