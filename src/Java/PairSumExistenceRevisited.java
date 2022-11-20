import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0; i<n; i++){
            if(hm.containsKey(Math.abs(t-arr[i]))){
                System.out.print("1");
                count++;
                break;
            }
            else{
                hm.put(arr[i],1);
            }
        }
        if(count==0){
            System.out.print("0");
        }
    }
}