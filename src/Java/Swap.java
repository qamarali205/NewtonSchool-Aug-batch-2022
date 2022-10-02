import java.util.*;
 class Swap {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // a=a+b;
        // b=a-b;
        // a=a-b;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
    
}
