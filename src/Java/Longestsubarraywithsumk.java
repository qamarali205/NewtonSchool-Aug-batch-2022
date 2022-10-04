import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void findMaxLenHavingSumK(int arr[],int n,int k){
        int maxLength=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(sum==k){ //0
                maxLength=i+1;
            }

            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }

            if(hm.containsKey(sum-k)){
                int length=i-hm.get(sum-k);
                maxLength=Math.max(maxLength,length);
            }

        }
        System.out.println(maxLength);
    }
    //2,147,483,647 
    //1,000,000,000,0


    // 3 4 5
    //3
    //4
    //5

    public static void main (String[] args) throws IOException{
        InputStreamReader ipr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ipr);

        String str=br.readLine();
       // Scanner sc=new Scanner(System.in);
       // int t=sc.nextInt();
       int t=Integer.parseInt(str);
        while(t-- > 0){
            String str1[]=br.readLine().split(" ");
            //int n=sc.nextInt();
            int n=Integer.parseInt(str1[0]);
            //int k=sc.nextInt();
            int k=Integer.parseInt(str1[1]);

            String str2[]=br.readLine().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                //arr[i]=sc.nextInt();
                arr[i]=Integer.parseInt(str2[i]);
            }
            findMaxLenHavingSumK(arr,n,k);
        }
    }
}