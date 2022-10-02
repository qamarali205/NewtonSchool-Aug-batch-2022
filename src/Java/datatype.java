import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int integer=sc.nextInt();
        System.out.println(integer);
        long Long=sc.nextLong();
        System.out.println(Long);
        float Flt=sc.nextFloat();
        System.out.printf("%.2f",Flt);
        System.out.println("");
        double Db=sc.nextDouble();
        System.out.printf("% .4f",Db);
        System.out.println("");
        char chara=sc.next().charAt(0);
        System.out.println(chara);
                      
    }
}