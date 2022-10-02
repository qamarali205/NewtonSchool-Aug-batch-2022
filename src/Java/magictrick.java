import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int x=5;
    int A=sc.nextInt();
    int B=sc.nextInt();
    int add=A+x;
    int doub=add+add;
    int addeven=doub+B;
    int half=addeven/2;
    int result=half-x;
    System.out.print(result);
    }
}