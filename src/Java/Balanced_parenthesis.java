import java.util.*;
import java.io.*;
import java.lang.*;

@SuppressWarnings("unused")
public class Balanced_parenthesis {

	public Balanced_parenthesis() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		if(Balanced(s.toCharArray() , s.length()))
		 System.out.println("Yes");
		else
			System.out.println("No");

	}
	
	static char close(char c)
    {
        if (c == '(')
            return ')';
        if (c == '{')
            return '}';
        if (c == '[')
            return ']';
        return Character.MIN_VALUE;
    }
 
    static boolean Balanced (char expr[], int n)
    {
        // Base cases
        if (n == 0)
            return true;
        if (n == 1)
            return false;
        if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']')
            return false;
 
        char closing = close(expr[0]);
        int i, count = 0;
        for (i = 1; i < n; i++) {
            if (expr[i] == expr[0])
                count++;
            if (expr[i] == closing) {
                if (count == 0)
                    break;
                count--;
            }
        }
 
        if (i == n)
            return false;
 
        if (i == 1)
            return Balanced(Arrays.copyOfRange(expr, i + 1, n), n - 2);
        
        return Balanced(Arrays.copyOfRange(expr, 1, i), i - 1) && Balanced(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1);
    }
}