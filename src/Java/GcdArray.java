import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GcdArray {

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(findGCD(arr, n));
    }
}