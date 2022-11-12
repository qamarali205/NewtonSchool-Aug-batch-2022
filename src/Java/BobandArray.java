import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Deque<Integer> dq= new LinkedList<>();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        dq.addFirst(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>=dq.element()){
                dq.addFirst(arr[i]);
            }
            else{
                dq.addLast(arr[i]);
            }
        }
        while(dq.size()!=0){
            System.out.print(dq.poll()+" ");
        }
        
    }
}