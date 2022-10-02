import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Rootfinding {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double r1, r2;
    double determinant=b*b-4*a*c;
    if(determinant>0){
        r1=(-b+Math.sqrt(determinant))/(2*a);
        r2=(-b-Math.sqrt(determinant))/(2*a);
        System.out.format("%.2f \n%.2f",r1,r2);
        }
        else if(determinant==0){
            r1=r2=-b/(2*a);
            System.out.format("r1=r2=%.2f",r1);
        }
        else{
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.format("%.2f+i%.2f \n", real,imaginary);
            System.out.format("%.2f-i%.2f \n",real,imaginary);
        }
    }
}
