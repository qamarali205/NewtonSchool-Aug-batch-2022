import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int countChar(String str){
        HashSet<Character> s = new HashSet<Character>();
        for(int i = 0; i < str.length(); i++){     
            s.add(str.charAt(i));
        }
 
        // Return Answer
            return s.size();
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.print(countChar(str));
    }
}