import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean binary_search(long a[], int n, long tar) {
        int l=0;
    	int r = n - 1;
    	while (l <= r) {
    		int mid = (l + r) / 2;
    		if (a[mid] == tar) {
    			return true;
    		}
    		if (a[mid] < tar)l = mid + 1;
    		else r = mid - 1;
    	}
    	return false;
    }
    public static void main (String args[]) throws IOException
    {   
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        long a[] = new long[10000];
        for (int i = 1; i <= 10000; i++) {
            a[i-1] = (long)i*(long)i*(long)i;
        }
        boolean ans = false;
    	for (long i = 1; i <= 10000; i++) {
    		if (binary_search(a, 10000, n - i * i * i)) {
    			ans = true;
    			break;
    		}
    	}
    	if (ans) {
    		System.out.print("YES");
    	}
    	else {
    		System.out.print("NO");
    	}
    }
}