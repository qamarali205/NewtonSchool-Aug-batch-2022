import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;
 
        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;
 
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
 
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int x=sc.nextInt();
                System.out.println(floorSqrt(x));

    }
    }
}