import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LinearProbingInHashing {
    static int hashf(int num, int hashSize) {
        return num % hashSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int hashSize = sc.nextInt();
            int nums = sc.nextInt();
            int ht[] = new int[hashSize];
            Arrays.fill(ht, -1); // -?> arr[i] = -1;

            for (int j = 0; j < nums; j++) {
                int num = sc.nextInt();
                int hash = hashf(num, hashSize);
                int i = 0;

                while (i < hashSize && ht[(hash + i))%hashSize]!=-1){
                    i++; // linear probing
                }
                if (i < hashSize) {
                    ht[(hash + i) % hashSize] = num;
                }
            }

            for (int i = 0; i < hashSize; i++) {
                System.out.print(ht[i] + " ");
            }
            System.out.println();

        }
    }
}

// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//      static void hashing (int[] arr, int n, int h) {
//         int[] hash = new int[h];
//         for (int i = 0; i < h; i++) {
//             hash[i] = -1;
//         }
//         int m = -1;
//         int count = 0;
//         for (int j = 0; j < n; j++) {
//             m = arr[j] %h;
//             int x = 1;
//             while (hash[m] != -1 && count < h+1){
//                 m = (arr[j]+ (x++))%h;
//                 count++;
//             }
//             if (hash[m]== -1) {
//                 hash[m] = arr[j];
//             }
//             count = 0;
//         }
//         for (int i = 0; i < h; i++) {
//             System.out.print(hash[i]+" ");
//         }
//     }

//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             int h = sc.nextInt();
//             int  n = sc.nextInt();
//             int[] arr = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             hashing (arr, n, h);
//             System.out.println();
//         }
//     }
// }