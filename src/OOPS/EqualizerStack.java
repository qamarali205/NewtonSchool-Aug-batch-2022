import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      int i =0;
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int arr[] = new int[n];
                      int[] brr= new int[n-1];
                      for(int x=0;x<=n-1;x++)arr[x]=sc.nextInt();
                      for(int y=0;y<=n-2;y++)brr[y]=sc.nextInt();
                        Stack<Integer> stack = new Stack<>();
                    //     for(int x=0;x<n;x++)System.out.print(arr[x]+" ");
                    //   System.out.println();
                    //   for(int y=0;y<n-1;y++)System.out.print(brr[y]+" ");
                    //   System.out.println();
                        int j=0;

                        while(i<n-1){
                           stack.push(arr[i]);
                        //    int temp = stack.peek();
                        //    int temp2 = brr[j];

                        //  System.out.println(temp+"-"+temp2);
                           if(stack.peek()==brr[j]){
                              stack.pop();
                               i++;
                               j++;
                           }
                           else{
                               i++;
                           }
                        }
                        //PrintStack(stack);
                        if(stack.size()>1) System.out.print("NO");
                        else System.out.print("YES");
    }
    public static void PrintStack(Stack<Integer> s) 
{ 
      
    // If stack is empty 
    if (s.empty()) 
        return; 
    
    // Extract top of the stack 
    int x = s.peek(); 
    
    // Pop the top element 
    s.pop();
}
}