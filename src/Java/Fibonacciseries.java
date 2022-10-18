// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Fibonacciseries {
   static void Fab(int a, int b, int n){
       if(n==0){
           return;
       }
       int c=a+b;
       System.out.println(c);
       Fab(b,c,n-1);
   }
    public static void main(String[] args) {
        int n=5;
        int a=0; int b=1;
        System.out.println(a);
        System.out.println(b);
        Fab(a,b,n-2);
    }
}