import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void MaxMin(int arr[], int n){
         int min=0,max=0;
   /*If there is only one element then return it as min and max both*/
   if (n == 1)
      { min=max=arr[0]; }
   /* If there are more than one elements, then initialize min and max*/
   if (arr[0] > arr[1]){
      max = arr[0];
      min = arr[1];
   }
   else{
      max = arr[1];
      min = arr[0];
   }
   for (int i = 2; i<n; i++){
      if (arr[i] > max)
         max = arr[i];
      else if (arr[i] < min)
         min = arr[i];
   }
   System.out.println(max+ " "+ min);
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
      MaxMin(arr,n);
    }
    }
}