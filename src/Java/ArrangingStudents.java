import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static String arrangeStudents(int arr[], int n){
        int [] arr1=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr1[i])
            count++;
        }

        if(count>2)
        return "NO";
        else
        return "YES";
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0; j<t; j++){
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

           System.out.println(arrangeStudents(arr,n));
        }
    }
}