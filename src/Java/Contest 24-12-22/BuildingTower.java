import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException{
        // Your code here
       BufferedReader br=new BufferedReader(new 
       InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       String[] str=br.readLine().split(" ");
       PriorityQueue<Integer> q1=new PriorityQueue<>();
       PriorityQueue<Integer> q2=new PriorityQueue<>(java.util
       .Collections.reverseOrder());
       int[] s1=new int[n];
       int max=n;
       for(int i=0; i<n; i++){
           s1[i]=Integer.parseInt(str[i]);
           q2.add(s1[i]);
           while(!q2.isEmpty() && q2.peek()==max){
               System.out.print(q2.poll()+" ");
               max--;
           }
           System.out.println();
       
       }
    }
}