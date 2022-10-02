import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {


     static boolean isPrime(int n){
     if(n <= 1)
            return false;
        if(n <= 3)
            return true;
  
        // This is checked so that we can skip
        // middle five numbers in below loop
        if(n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
  
        return true;
    }
  

    
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
    int n=sc.nextInt();

    if (isPrime(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    }
}