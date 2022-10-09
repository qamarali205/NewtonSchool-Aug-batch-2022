import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[],int l, int r){
        
        int pivot=arr[r];
        int i=l-1;
        for(int j=l;j<=r-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }



    public static void quickSort(int arr[],int l, int r){
        if(l<r){// at least element should be there to partition
            int p= partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }

    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        quickSort(arr,0,n-1);

        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}