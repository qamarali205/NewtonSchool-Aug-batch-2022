import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static boolean buildingsCrossed(int arr[],int n,int energy){
        
        for(int i=0;i<n;i++){
            energy=2*energy - arr[i];
            if(energy >=100000){
                return true;
            }
            if(energy<0){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
                      // Your code here
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0; i<n; i++){
         arr[i]=sc.nextInt();
     }
        int l=0;
        int r=100000;
        int ans=0;

        while(l<=r){ // binary search algorithm
            int m=l+(r-l)/2;
            if(buildingsCrossed(arr,n,m)){
                r=m-1;
                ans=m;
            }
            else{
                l=m+1;
            }
        }


        System.out.println(ans);

    }
}