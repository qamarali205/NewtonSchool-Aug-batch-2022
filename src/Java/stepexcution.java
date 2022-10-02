import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int add=n+8;
    int div=add/3;
    int mod=div%5;
    int result=mod*5;
    System.out.println(result);
    
    }
}