import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long count = 0;
            int total = 0;
            while (a > 0) {
                if ((a & 1) == 1)
                    total++;
                a = a >> 1;
            }
            if (total == 0)
                System.out.println(1);
            else
                System.out.println((long) Math.pow(2, total));
        }
    }
}