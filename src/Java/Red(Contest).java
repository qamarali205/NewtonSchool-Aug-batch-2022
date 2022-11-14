import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char arr[]=str.toCharArray();
        boolean test=(str.contains("r")&& str.contains("e"));

        if(test&&str.contains("d"))
           System.out.print("Yes");
           else
           System.out.print("No");
    
    }
}