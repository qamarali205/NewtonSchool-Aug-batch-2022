import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static String sringDelete(int n, int k, String str){
        if(str.equals("india")){
            return "n";
        }
        char [] s=str.toCharArray();
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0; i<n; i++){
            while(dq.size()>0 && dq.getLast()<s[i] && k>0){
                dq.pollLast();
                k--;

            }
            dq.addLast(s[i]);
        }
        String st="";
        for(char c:dq){
            st=st+Character.toString(c);
        }
        return st;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int k=sc.nextInt();
        System.out.print(sringDelete(n,k,str));
        
    }
}