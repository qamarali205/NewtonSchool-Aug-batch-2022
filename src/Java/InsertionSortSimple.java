// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static void InsertionSort(int arr[], int n){
        for(int i=1;i<n;i++){ // starting from 2nd element
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key ){ // go back
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=key; // fitting it into right position
        }
        }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr,n);
        
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}