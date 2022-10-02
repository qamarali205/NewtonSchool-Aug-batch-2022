import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    // 0 smaleer<- x-> greater  6
    //             i


    //34 56 12 37 89 12 13   - 0   r
    // pivot =13

    // 12 12<-     13  -> 34 56 37 89 -> 3 6
    // 0   1        2     34 56 89<-        89

    // 12<-   12//                           low    high

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[],int l, int r){
        // pivot as last element - arr[r]
        // partition the array aropund it
        // return the new index of pivot
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

//     10 30  40   50  70  80  90
    // 10, 80, 30, 90, 40, 50, 70
    // 0                        6
    // l                        r
    //pivot=70
    //i=-1

    // 10 30 40 50<- 70 -> 80 90

    // 0 1   2   3    4    5  6

    // 10 30 40 50       80 90    5,6

    // 10 30 40

    // 10 30
    // 0  1

    //10

    public static void quickSort(int arr[],int l, int r){
        if(l<r){// at least element should be there to partition
            int p= partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }

    // 0,6 -> 0,3 -> 0,2 ->0,1 ->0,0

    // 0,6 -> 0,3 -> 0,2 ->0,1 ->0,0 ->2,1 -> 3,2

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