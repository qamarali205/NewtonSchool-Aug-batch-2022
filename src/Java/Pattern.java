import java.util.*;
public class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=1;
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(value);
                value++;
            }
            System.out.println(" ");
        }
    }
}