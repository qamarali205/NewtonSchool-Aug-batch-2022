import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GCD {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        gcd(m, n);
    }
    public static void gcd(long m, long n) {
        while(n != 0) {
            if(m>n) {
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        System.out.print(m);            

        
                    
    }
}