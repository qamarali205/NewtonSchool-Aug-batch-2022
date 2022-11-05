import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        int pascalArr[][]= new int[502][502];
        pascalArr[1][1] = 1;
        for(int i=2; i<=501; i++){
            for(int j=1; j<=i; j++){
                pascalArr[i][j]= (pascalArr[i-1][j] + pascalArr[i-1][j-1]) % 1000000007;
            }
        }
       
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int i= sc.nextInt();
            int j= sc.nextInt();
            System.out.println(pascalArr[i+1][j+1]);
        }
    }
}