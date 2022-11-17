import java.util.Scanner;

// max diff, such that larger is after smaller
public class ArrayPractice {

    public static void printMaxDiff(int arr[],int n){
        int max=arr[n-1];
        int bestDifference=0;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<max){
                //check if you get better difference
                bestDifference=Math.max(bestDifference,max-arr[i]);
            }
            else{
                max=arr[i];
            }
        }

        System.out.println(bestDifference);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printMaxDiff(arr,n);
    }
}