import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    char p1=sc.next().charAt(0);
    char p2=sc.next().charAt(0);
    if(p1=='R' || p2=='R'){
       System.out.print("R");
    }
      else{
          if(p1=='J'){
          System.out.print(p2);
         }else {
              if(p2=='J'){
              System.out.println(p1);
          }else{
              System.out.println("D");
          }
      }
}
    }
}