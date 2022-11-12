import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static int longestValidParentheses(String s) {
		if (s == null) return -1;
        if (s.length() == 0) return 0;
        char[] str = s.toCharArray();
        int sum = 0, res = 0, len = 0, n = s.length();
		// Scan the string from left side, plus 1 for '(' and minus 1 for ')'.
        for (int i = 0; i < n; i++) {
            if (str[i] == '(') sum++;
            else sum--;
            if (sum < 0) {
                sum = 0;
                len = 0;
            } else {
                len++;
                if (sum == 0) res = Math.max(res, len);
            }
        }
		// Scan again from right side, plus 1 for ')' and minus 1 for '('.
        sum = 0;
        len = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (str[i] == ')') sum++;
            else sum--;
            if (sum < 0) {
                sum = 0;
                len = 0;
            } else {
                len++;
                if (sum == 0) res = Math.max(res, len);
            }
        }
        return res;
      
    }
    public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(longestValidParentheses(str));

    }
}