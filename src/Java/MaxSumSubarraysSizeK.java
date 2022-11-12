public class MaxSumSubarraysSizeK {
//  1 2 3 4 5 6 7 8
  //i

  // j=0  1 2

    // k=3
    public static int maxSumSubArraysSizeK(int arr[],int n,int k){

        int maxSum=Integer.MIN_VALUE;// -11111111
        // 0 1 2 3 4 5 6 7 8   n=9  k=4
        //       i

        // 1st window

        // 0 1 2 2
        for(int i=0;i<=n-k;i++){ // i =x  6  6 7 8 9
            int sum=0;

            for(int j=0;j<k;j++){
                sum=sum+arr[i+j];
            }

            maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static int maxSumSubArraysSizeKSlidingWindow(int arr[],int n,int k){
        int maxSum=0;
        // 10  k=3
        for(int i=0;i<k;i++){   // 0 2 -> 3
            maxSum=maxSum+arr[i];
        }

        int newSum=maxSum;
        for(int i=k;i<n;i++){   // 3 to 9
            newSum= newSum+arr[i]-arr[i-k];
            maxSum=Math.max(newSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(maxSumSubArraysSizeK(arr,n,k));

        System.out.println(maxSumSubArraysSizeKSlidingWindow(arr,n,k));
    }
}