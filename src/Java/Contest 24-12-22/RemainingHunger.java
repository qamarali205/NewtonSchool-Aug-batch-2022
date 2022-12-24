import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int remainingHungers(int []stu, int[] para){
        Queue<Integer> que=new LinkedList();
        for(int x:stu){
            que.offer(x);
        }
        for(int i=0; i<para.length; i++){
            int size=que.size();
            int attempts=0;
            while(!que.isEmpty()){
                if(que.peek()==para[i]){
                    que.poll();
                    break;
                }else
                {
                    attempts++;
                    que.offer(que.poll());
                    if(size==attempts){
                        return que.size();
                    }
                }
            }
        }
        return 0;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int brr[]=new int[n];
        for(int i=0; i<n; i++){
            brr[i]=sc.nextInt();
        }
        System.out.print(remainingHungers(arr,brr));
    }
}