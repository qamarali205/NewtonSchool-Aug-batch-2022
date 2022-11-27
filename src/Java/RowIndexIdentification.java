import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException{
        // Your code here
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String line1[]=br.readLine().split(" ");
       int r=Integer.parseInt(line1[0]);
       int c=Integer.parseInt(line1[1]);
       long maxSum=Integer.MIN_VALUE;
       int idx=0;
       int mat[][]=new int[r][c];
       for(int i=0; i<r; i++){
           long sum=0;
           String line2[]=br.readLine().split(" ");
           for(int j=0; j<c; j++){
               mat[i][j]=Integer.parseInt(line2[j]);
               sum+=mat[i][j];
           }
           if(sum>maxSum){
               maxSum=sum;
               idx=i;
           }
       }

        System.out.println(idx+1);
 
    }
}