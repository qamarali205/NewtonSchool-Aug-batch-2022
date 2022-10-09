// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static void bubbleSort(int arr[], int n){
        for(int i=0;i<n-1;i++)
            for(int j=0; j<n-i-1; j++)
                if(arr[j]>arr[j+1]){
                 
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
        }
        }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}