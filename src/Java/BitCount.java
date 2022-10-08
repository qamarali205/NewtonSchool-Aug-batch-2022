import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long j = 1;
        int count = 0;
        for(int i = 0; i < 64; i++){
            if((n & (j << i)) != 0){ 
                count++;
            }
        }
        System.out.println(count);
    }
}
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     static long countBit(long n){
//         if (n == 0)
//             return 0;
//         else
//             return 1 + countBit(n & (n - 1));
//     }
//     public static void main (String[] args) {
//                       // Your code here
//         Scanner sc=new Scanner(System.in);
//         long n=sc.nextLong();

//         System.out.print(countBit(n));
//     }
// }