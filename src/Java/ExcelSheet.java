import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long rowNum(String str){
        long res=0L;
        int mod=1000000007;
        for(int i=0; i<str.length(); i++){
            res=(res*26)%mod;
            res+=str.charAt(i)-'A'+1;
        }
        return res%mod;

    }
    public static void main (String[] args) {
                      // Your code here
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(rowNum(str));
    }
}