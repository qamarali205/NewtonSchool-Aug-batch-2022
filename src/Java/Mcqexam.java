import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Mcqexam {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int P=sc.nextInt();
    int Q=sc.nextInt();
    int R=sc.nextInt();
    int S=sc.nextInt();
    if(P>=Q && P>=R && P>=S){
        System.out.print(P);
    }else if(Q>=P && Q>=R && Q>=S){
        System.out.print(Q);
    }else if(R>=P && R>=Q && R>=S){
        System.out.print(R);
    }else{
        System.out.print(S);
    }

    }
}