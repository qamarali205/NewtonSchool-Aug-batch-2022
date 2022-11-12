import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxInEveryWindow {
//[  y  x ]<-
    public static void maxInEveryWindow(int arr[],int n,int k){

        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<k;i++){ // process the first k elements
            //remove already existing useless elements
            while (!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }

            //addition
            deque.addLast(i);
        }

        for(int i=k;i<n;i++){  // 5  ->  <=2
            System.out.print(arr[deque.peekFirst()] +" "); // previous window max

            // remove non window elements, first element of previous window
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }


            //remove already existing useless elements
            while (!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }

            //addition
            deque.addLast(i);
        }


        System.out.print(arr[deque.peekFirst()] +" ");


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        maxInEveryWindow(arr,n,k);

    }
}



