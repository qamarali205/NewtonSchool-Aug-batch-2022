import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GcdFrequency {

   public static int gcd(int a, int b){
        if(b==0){
           return a;
              }else{
          return gcd(b,a%b);
       }
     }
    public static void main (String[] args) {
                      // Your code here          
      Scanner sc = new Scanner(System.in);
        int sum=0;
        int n= sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
        a[i]= sc.nextInt();
         }
        for(int i=0;i<=n-1;i++){
            int count =0;
             for(int j=0;j<=n-1;j++){
                     if(a[i]==a[j]){
                        count++;
                     }
              }
            sum+=gcd(a[i],count);
             }
            System.out.print(sum);
            }
}