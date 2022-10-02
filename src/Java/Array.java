import java.util.*;
class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];

      // input for user loop
       for(int i=0; i<n; i++){ 
        array[i]=sc.nextInt();
       }
        // output loop
        for( int i=0; i<n; i++){ 
            System.out.print(array[i] +" ");
        }
                   
        }
    }
