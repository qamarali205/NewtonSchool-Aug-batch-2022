import java.util.*;

class Sumofarray{

    static int Sum(int arr[], int n){
        int s=0;
        for(int i=0; i<n; i++){
            s=s+arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];

         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

         }
         System.out.print(Sum(arr,n));
    }
}