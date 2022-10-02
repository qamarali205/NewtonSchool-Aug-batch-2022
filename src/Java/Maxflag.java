import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Maxflag {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] a=new int[100000];
        int[] b=new int[100001];
         while(t>0){
        int n=sc.nextInt();
        int m=sc.nextInt();
                           
      for(int i=0;i<m;i++){
        a[i]=sc.nextInt();
           }
                           
         for(int i=1;i<=n;i++){
            b[i]=0;
             }
           for(int i=0;i<m;i++){
                 if(a[i]<=n&&a[i]>=1){
                   b[a[i]]=b[a[i]]+1;
                  }
                    else if(a[i]==n+1){

            for(int j=1;j<n;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;


                }

                               }
                               for(int k=1;k<=n;k++){
                                   b[k]=b[n];

                           }}

                           }
                            for(int i=1;i<=n;i++){
                                System.out.print(b[i]+" ");
                            }
                            System.out.println("");

                          t--;
                      }
                      
    }
}