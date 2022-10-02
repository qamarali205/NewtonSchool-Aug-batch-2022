import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Chess {
   public static void main (String[] args) throws Exception{
                      // Your code here
                      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      int n = Integer.parseInt(br.readLine());
                      StringBuilder sb = new StringBuilder();
                      int[][] a=new int[n][n];
                      
                      int i,j,c1=0,c2=0;
                      if(n>=1 && n<=1000){
                      for(i=0;i<n;i++)
                      {
                           String[] line = br.readLine().split(" ");
                          for(j=0;j<n;j++){
                              a[i][j]=Integer.parseInt(line[j]);       
                              int x=(i+j)&1;
                              if(a[i][j]==x)
                                     c1+=1;        
                              else
                                   c2+=1;
                             }
                      }
                      if(c1>=c2)
                      sb.append(c2);
    
                      else
                      sb.append(c1);

                      System.out.print(sb.toString());
                  
    }
}
}