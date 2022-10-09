// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static int linearSearch(int arr[], int n, int key){
        for(int i=0; i<n; i++){
        if(arr[i]==key){
            return i;
        }
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
        int res=linearSearch(arr,n,key);
        if(res!=-1){
            System.out.println(res);
        }else{
            System.out.println("Not found");
        }
    }
}