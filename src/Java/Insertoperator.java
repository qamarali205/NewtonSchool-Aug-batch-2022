import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Insertoperator {
    public static int rec(long [] arr,long sum,int i)
  {  
	  if(i==arr.length){
		  if(sum==0)
		  return 0;
	  
		  else
	  	return 1;}
	  return rec(arr,sum-arr[i],i+1)*rec(arr,sum+arr[i],i+1);
	
  }

	public static void main (String[] args) {
                 Scanner sc=new Scanner(System.in);
				 int n=sc.nextInt();
				 long target=sc.nextLong();
				long [] arr=new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextLong();
			}
			int sum=rec(arr,target,0);
			if(sum==0)
			System.out.println("YES");
			else
			System.out.println("NO");
    }
}


// package batch_assignments;


// import java.util.Scanner;

// // don't change the name of this class
// // you can add inner classes if needed
// class InsertOperator {
//     static boolean insert(long arr[], int idx, long sum, long k) {
//         // base cond
//         if (idx == arr.length) {
//             if (sum == k) return true;
//             else return false;
//         }

//         if (insert(arr, idx + 1, sum + arr[idx], k)) {
//             return true;
//         }
//         return insert(arr, idx + 1, sum - arr[idx], k);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         long k = sc.nextLong();
//         long arr[] = new long[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextLong();
//         }

//         if (insert(arr, 1, arr[0], k)) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }

//     }
// }