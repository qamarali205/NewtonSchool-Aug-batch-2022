import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {


    //  arr1  3 7 9     arr2  4 8 10
    //          i             j

    //    arr 3 4 7 8 9 10
    //          k

    // l to m
    // m+1 r

   // 32 12 1 13 7 16 19 16 14

    //32 12 1 13 7      16 19 16 14

    //32 12 1      13 7      16 19      16 14

    //32 12     1      13    7      16    19      16    14

    //32    12     1      13    7      16    19      16    14
    public static void merge(int arr[],int l, int m, int r){
        int n1= m-l+1;
        int n2= r-m;

        //  0028e37238378 []2398642378482346237]

        //[978361287]
        //[1298612]

        int L[]=new int[n1]; // [0 ,0 ,0 ,0 ] 4
        int R[]=new int[n2]; // [ , , ]

        for(int i=0;i<n1;i++){ // L [0 1 2 3]
            L[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }

        int i=0;
        int j=0;
        int k=l;


        //  arr1  3 7 9    3 arr2  4 8 10 12 15      5
        //              i                       j

        //    arr 3 4 7 8 9 10 12 15
        //                           k
        while(i<n1 && j<n2){ // till the time at least both arrays have elements to compare
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
//


    }

    // arr , 0 ,6  -> 0,3   4,6


    //32 12 1 13 7 16 19 16 14
    //l          m           r
    //0  1  2  3  4 5  6  7  8



    // 32 12 1 13 7 16 19 16 14

    //32 12 1 13 7      16 19 16 14

    //32 12 1      13 7      16 19      16 14

    //32 12     1      13    7      16    19      16    14

    //32    12     1      13    7      16    19      16    14
    public static void mergeSort(int arr[],int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m); //    sorted
            mergeSort(arr,m+1,r); //   sorted
            merge(arr,l,m,r);
        }
    }


    // 1 - bubble merge insertion
    // 2 - problem input -> o/p

    // nlogn -  N

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Arrays.sort(arr);
        //32 12 1 13 7 16 19 16 14

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        mergeSort(arr,0,n-1);

        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}