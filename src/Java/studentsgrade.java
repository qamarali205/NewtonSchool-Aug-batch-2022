import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int sub1=sc.nextInt();
    int sub2=sc.nextInt();
    int sub3=sc.nextInt();
    int sub4=sc.nextInt();
    int sub5=sc.nextInt();
    int average=(sub1+sub2+sub3+sub4+sub5)/5;
    int per=(average*100)/100;
    if(per>=80){
        System.out.println("A");
    }
    else if(per<80 && per>=60){
        System.out.println("B");
    } 
    else if(per<60 && per>=40){
        System.out.println("C");
    }
    else{
        System.out.println("D");
    }

    }
}