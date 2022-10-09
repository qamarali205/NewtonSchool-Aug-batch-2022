// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static int binarySearch(int arr[], int l, int r, int key){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(arr[mid]==key)
            return mid;
            
            if(arr[mid]>key)
            return binarySearch(arr, l,mid-1,key);
            return binarySearch(arr, mid+1, r, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int res=binarySearch(arr,0,n-1,key);
        if(res!=-1){
            System.out.println(res);
        }else{
            System.out.println("Not found");
        }
    }
}