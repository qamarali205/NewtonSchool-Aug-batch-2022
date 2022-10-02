import java.util.*;
public class Arrayrev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];// length 5

      // input for user loop
       for(int i=0; i<n; i++){ //1 2 3 4 5
        array[i]=sc.nextInt();
       }
        // output loop
        for( int i=n-1; i>=0; i--){ 
            System.out.print(array[i] +" ");//5 4 3 2 1
        }
                   
        }
    }
