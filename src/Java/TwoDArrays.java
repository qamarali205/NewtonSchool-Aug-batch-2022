import java.util.*;

class TwoDArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // int t=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        //while(t>0){
        int[][] array=new int[m][n];

        // input array
        for(int i=0; i<m; i++){ //rows
            for(int j=0; j<n; j++){  //cols
                array[i][j]=sc.nextInt();
            }
        }

        // print array
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
        //         System.out.print(array[i][j] +" ");
        //     }
        //     System.out.println();
        // }
          
          //boundry traversal print
          if(i==0 || j==n-1){
            System.out.print(array[i][j] +" ");
          }
             }
         }
          System.out.println();

        }
    }
