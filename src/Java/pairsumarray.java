import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long target=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.print("Pair found ("+arr[j]+", "+arr[i]+")");
                return;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.print("Pair not found");
    }
}