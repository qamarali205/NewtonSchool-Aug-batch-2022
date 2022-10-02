import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1=sc.next();
        String str2=sc.next();
        char[]arr1=new char[n];
        char[] arr2=new char[n];
        for(int i=0; i<n; i++){
            if(str1.charAt(i)=='0' && str2.charAt(i)=='1'){
                System.out.print(1);
            }
            else if(str1.charAt(i)=='1' && str2.charAt(i)=='0'){
                System.out.print(1);
            }
            else
            System.out.print(0);
        }
    }
}