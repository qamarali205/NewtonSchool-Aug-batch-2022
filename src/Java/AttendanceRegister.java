import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       HashMap<String, Integer> map=new HashMap<>();
       for(int i=0; i<n; i++){
           String str=sc.next();
           map.put(str, map.getOrDefault(str,0)+1);

       }
        int count =0;
        for(Map.Entry<String, Integer> e:map.entrySet()){
            int value=e.getValue();
            if(value>1)
            count++;
        }
        System.out.print(count);
    }
}