import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Find {
    public static void numberMatches(long k) {
        long start=1;
        long last=(int)Math.sqrt(k);
        while(start<=last){
            long x=start+(last-start)/2;
            if(k==(x*x)+(3*x)){
                System.out.print(x);
                return;
            }
            else if(k<(x*x)+(3*x)){  // K=x^2+3x find x k given here in input
                last=x-1;
            }
            else start=x+1;
        }
        System.out.print("-1");
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        numberMatches(k);               
                    
    }
}