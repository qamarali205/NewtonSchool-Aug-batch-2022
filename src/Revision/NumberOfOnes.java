import java.util.Scanner;

public class NumberOfOnes {

    // 0 9
    public static int findNumberOfOnes(int arr[],int l,int r){
        if(arr[r]==0){
            return 0;
        }
        if(arr[l]==1){
            return r-l+1;
        }
        int mid=r+(r-l)/2;
        return findNumberOfOnes(arr,l,mid)
                +findNumberOfOnes(arr,mid+1,r);
    }

    // 00111
    // 56789
    // l   r

    // 0

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findNumberOfOnes(arr,0,n-1));
    }
}