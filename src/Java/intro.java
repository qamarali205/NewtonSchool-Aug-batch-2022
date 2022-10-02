// import java.util.Scanner;

// class Main{
//     public static void main(String[] args){
//         int n;
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         String s =Integer.toString(n);
//         if(n==Integer.parseInt(s))
//             System.out.println("NIce Job");
//         else
//         System.out.println("Not");
//     }
// }

public class TestingMethods2
{
void show()
{
System.out.println("Show method..");
return;
}
public static void main(String[] args)
{
TestingMethods2 t2=new TestingMethods2();
t2.show();
}}