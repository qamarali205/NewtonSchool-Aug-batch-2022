import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static int powerOfTwoNumbers(int a,int b){  // 2 ,8 ->256
        int ans=1;
        while(b>0){
            if(b%2==1){
                ans=ans*a;
            }
            b=b/2;
            a=a*a;
        }
        return ans;
    }

    // public static int mod(int n, int m){
    // int power = (int)Math.pow(2,n);  // > 10000000000
    // System.out.println(power);
    // return m%power;
    // }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt(); // 2147483647
        /////////////////////. 1073741824
        //                     2147483648

        // 2^31 - integer
      //  System.out.println(mod(n,m));
        // 8888 , 8888

// x%y.   x>y ->x
// m % 2^n 

// 8888 % >8888

// 2^108 -> very big number
        if(n>30){
            System.out.println(m);
            return;
        }

        int power = powerOfTwoNumbers(2,n);

        System.out.println(m%power);
    }
}


// n , m
// m mod 2^n
// 42.  2^4->16
// 10

// 1-6 -> power
//-> take modulus
// n-> >6. -> 7,8,9
//           128 


// 108 % 128 -> 108