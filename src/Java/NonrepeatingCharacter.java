import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) != null) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {

            if (hm.get(str.charAt(i)) == 1) {
                System.out.println(i);
                break;
            } else {
                if (i == str.length() - 1) {
                    System.out.println("-1");
                }
            }
        }
    }
}