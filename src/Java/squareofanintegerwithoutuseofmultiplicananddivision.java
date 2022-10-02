import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int findSquare(int n)
    {
        int odd = 1;
        int sq = 0;
 
        // convert the number to positive if it is negative
        n = Math.abs(n);
 
        while (n-- > 0)
        {
            sq = sq + odd;
            odd = odd + 2;
        }
 
        return sq;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(findSquare(n));
    }
}