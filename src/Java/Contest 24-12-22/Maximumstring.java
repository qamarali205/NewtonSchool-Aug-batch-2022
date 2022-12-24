import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int k =sc.nextInt();
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
         for(int i=1;i<s.length();i++){
             while(!st.isEmpty() && s.charAt(i)>st.peek() && k-->0){
                 st.pop();
             }st.push(s.charAt(i));
             if(s.charAt(i)<st.peek() && k-->0){
                 st.push(s.charAt(i));
             }
        }
        Iterator i= st.iterator();
        while(i.hasNext())
        System.out.print(i.next());
    }
}