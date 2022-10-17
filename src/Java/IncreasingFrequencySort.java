import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int[] frequencySort(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
        for(int val : nums)
            map.put(val,map.getOrDefault(val,0)+1);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]!=a[1] ? a[1]-b[1] : b[0]-a[0]);
        for(Map.Entry<Integer,Integer>m : map.entrySet())
            pq.add(new int[]{m.getKey(),m.getValue()});
        int i=0;
        while(!pq.isEmpty()){
            int a[]=pq.poll();
            while(a[1]-->0)
                nums[i++]=a[0];
        }
        return nums;
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       frequencySort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}