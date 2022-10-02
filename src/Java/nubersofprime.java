import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void soe(int n){
        boolean[] prime=new boolean[n+1];
        for(int i=0; i<=n; i++){
            prime[i]=true;
        }
        for(int i=2; i<=n; i++){
            if(prime[i]==true){
                for(int j=i+i; j<=n; j=j+i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2; i<=n; i++){
            if(prime[i]==true){
                count++;
              }
            }
            System.out.println(count);
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    soe(n);
    }
}