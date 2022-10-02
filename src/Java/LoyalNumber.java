import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static Vector<Integer>minmaxNumbers(int[][] matrix,
              Vector<Integer> res)        
{
     
    // Initialize unordered set
    Set<Integer> set = new HashSet<Integer>();
   
    // Traverse the matrix
    for(int i = 0; i < matrix.length; i++)
    {
        int minr = Integer.MAX_VALUE;
        for(int j = 0; j < matrix[i].length; j++)
        {
             
            // Update the minimum
            // element of current row
            minr = Math.min(minr, matrix[i][j]);
        }
   
        // Insert the minimum
        // element of the row
        set.add(minr);
    }
   
    for(int j = 0; j < matrix[0].length; j++)
    {
        int maxc = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++)
        {
             
            // Update the maximum
            // element of current column
            maxc = Math.max(maxc, matrix[i][j]);
        }
   
        // Checking if it is already present
        // in the unordered_set or not
        if (set.contains(maxc))
        {
            res.add(maxc);
        }
    }
    return res;
}
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int mat[][]=new int[r][c];

    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            mat[i][j]=sc.nextInt();
        }
        }
       Vector<Integer> ans = new Vector<Integer>();
   
    // Function call
    ans = minmaxNumbers(mat, ans);
   
    // If no such matrix
    // element is found
    if (ans.size() == 0)
        System.out.println("-1");
   
    for(int i = 0; i < ans.size(); i++)
        System.out.print(ans.get(i));
    }
}