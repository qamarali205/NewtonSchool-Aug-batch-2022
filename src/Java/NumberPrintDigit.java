import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean isPresentDigit(int N, int D){
        while (N > 0)
        {
            if (N % 10 == D)
                break;
 
            N = N / 10;
        }
 
        // If loop broke
        return (N > 0);
    }
    static void printDigit(int N, int D){
        for(int i=0; i<=N; i++){
            if(i==D || isPresentDigit(i,D))
            System.out.print(i +" ");
        }
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int D=sc.nextInt();
        printDigit(N,D);              
    }
}