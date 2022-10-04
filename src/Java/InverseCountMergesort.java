import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
	}

	public static long mergeSortAndCount(int[] arr, int l,int r)
    {
       long count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

	public static long mergeAndCount(int[] arr, int l, int m, int r)
    {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        long inversionCount = 0;
		
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                inversionCount += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
            
        return inversionCount;
    }
}


// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class InverseCountMergesort {
//     static int getInvCount(int arr[], int n)
//     {
//         int count = 0;
//         for (int i = 0; i < n - 1; i++)
//             for (int j = i + 1; j < n; j++)
//                 if (arr[i] > arr[j])
//                     count++;
  
//         return count;
//     }
//     public static void main (String[] args) {
//                       // Your code here
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int arr[]=new int[n];

//     for(int i=0; i<n; i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.print(getInvCount(arr,n));
//     }
// }