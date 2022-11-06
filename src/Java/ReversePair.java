import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int reversePair(int arr[]){
        int n=arr.length;
        if(arr==null || n==0)
        return 0;
        return mergeSort(arr,0,n-1);

    }
    static int mergeSort(int arr[], int l, int r){
        if(l>=r)
            return 0;
            int mid=l+(r-l)/2;
            int res=mergeSort(arr,l,mid)+mergeSort(arr,mid+1,r);

            int j=mid+1;
            for(int i=l; i<=mid; i++){
                while(j<=r && arr[i]/2.0>arr[j]){
                    j++;
                }
                res+=j-(mid+1);
            }
            Arrays.sort(arr,l,r+1);
            return res;

        
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(reversePair(arr));
    }
}