import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Leapyear {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%4==0 && n%100!=0 || n%400==0){
        System.out.println("YES");
    }else 
    {
        System.out.println("NO");
    }
    }
}