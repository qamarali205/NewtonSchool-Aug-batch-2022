import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println(result);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return(n*fact(n-1));
        }
    }
}