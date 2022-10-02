import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static int longestUniqueSubsttr(String str)
{
    int n = str.length();
     
    int res = 0;
     
    for(int i = 0; i < n; i++)
    {
        boolean[] visited = new boolean[256];
         
        for(int j = i; j < n; j++)
        {
             
            if (visited[str.charAt(j)] == true)
                break;
            else
            {
                res = Math.max(res, j - i + 1);
                visited[str.charAt(j)] = true;
            }
        }
        visited[str.charAt(i)] = false;
    }
    return res;
}
 
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
    String str=sc.next();
    int length = longestUniqueSubsttr(str);
    System.out.println(length);
    }
    }
}