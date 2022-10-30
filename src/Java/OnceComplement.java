import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long onesComp(long n){
       
        long numberOfbits=(long)(Math.floor(Math.log(n)/Math.log(2)))+1;
        return ((1<<numberOfbits)-1)^n;
    }
    public static void main (String[] args) {
                      // Your code 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            System.out.println(onesComp(n));
        }
    }
}