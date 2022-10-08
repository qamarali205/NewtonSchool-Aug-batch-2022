import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long floors(long n){
        long m=0;
        if(n==1)
        return 1;
        int i=0;
        while(n>=1){
        if(Math.pow(2,i)== n)
        {
            m=m+1;
            break;
        }
        else{
            i++;
            if(Math.pow(2,i)>n){
                m =m+1;
                n =(long)Math.abs(n - Math.pow(2,i-1));
                i=0;
            }
        }
    }
    return m;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(floors(n));
    }
}