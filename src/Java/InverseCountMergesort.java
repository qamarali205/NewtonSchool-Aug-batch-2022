import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class InverseCountMergesort {
    static int getInvCount(int arr[], int n)
    {
        int count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    count++;
  
        return count;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(getInvCount(arr,n));
    }
}