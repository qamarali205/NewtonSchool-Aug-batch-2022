// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Fact {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return (n*(factorial(n-1)));
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(factorial(n));
    }
}