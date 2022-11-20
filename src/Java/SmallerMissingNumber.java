import java.util.Scanner;

public class SmallerMissingNumber {


    public static int smallestMissing(int arr[],int l,int r){

        if(l>r){
            return l;
        }
        int m=l+(r-l)/2;
        if(m==arr[m]){
            return smallestMissing(arr,m+1,r);
        }
        else{
            return smallestMissing(arr,l,m-1);
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(smallestMissing(arr, 0, n - 1));
    }
}