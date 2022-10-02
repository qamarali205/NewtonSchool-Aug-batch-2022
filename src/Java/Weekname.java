import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Weekname {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    switch(n){
        case 1:
        System.out.print("Monday");
        break;
        case 2:
        System.out.print("Tuesday");
        break;
        case 3:
        System.out.print("Wednesday");
        break;
        case 4:
        System.out.print("Thursday");
        break;
        case 5:
        System.out.print("Friday");
        break;
        case 6:
        System.out.print("Saturday");
        break;
        default:
        System.out.print("Sunday");
        break;
    }
    }
}