import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void insertionSort(int[] arr,int n){
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
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr,n);//sorting array using insertion sort    
           
            
        for(int i:arr){    
            System.out.print(i+" ");    
        }   
        System.out.println(); 
    }
    }
}