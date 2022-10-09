// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static void SelectionSort(int arr[], int n){
        for(int i=0;i<n;i++){ 
            int min_index=i;
            for(int j=i+1; j<n; j++)
                if(arr[j]<arr[min_index])
                min_index=j;
                
                int temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;                     
        }
        }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr,n);
        
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}