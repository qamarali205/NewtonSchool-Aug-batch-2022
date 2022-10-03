import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static long countSubarray(int arr[], int n){

        HashMap<Integer, Integer> hm=new HashMap<>();
        int curr_sum=0;
        for(int i=0; i<n; i++){
            curr_sum+=(arr[i]==0)?-1:arr[i];
            hm.put(curr_sum, hm.get(curr_sum)==null?1:hm.get(curr_sum)+1);
        }
            long count=0;
            for (HashMap.Entry<Integer, Integer> itr :
             hm.entrySet()) {
 
            if (itr.getValue() > 1)
                count += ((itr.getValue()
                           * (itr.getValue() - 1))
                          / 2);
        }
 
        if (hm.containsKey(0))
            count += hm.get(0);
 
        
        return count;
        
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(countSubarray(arr,n));
    }
}