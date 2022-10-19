import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static String frequencySort(String s) {
       int[] arr = new int[75];
        Arrays.fill(arr,-1);
        for(char ch : s.toCharArray()) {
            if(arr[ch-'0']==-1) arr[ch-'0'] = 0;
            arr[ch-'0']++;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<75;i++){
            int max = Integer.MIN_VALUE;
            int ind= 0;
            for(int j=0;j<75;j++) {
                if(max<arr[j]){
                    max = arr[j];
                    ind = j;
                }
            }
            while(max-->0) res.append((char)(ind+'0'));
            arr[ind] = Integer.MIN_VALUE;
        }
        return res.toString();
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.print(frequencySort(str));
    }
}