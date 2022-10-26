// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int k=4;
        for(int i=0; i<n; i++){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            while(left<right){
                int temp=arr[n];
                arr[n]=arr[left];
                arr[left]=temp;
                left+=1;
                right-=1;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
