import java.util.Scanner;

public class RecursionPractice {
  // i- initial number

    // ans= [ 0, , ]->2
    // ans= [ 0,1, ] -> 1
    //ans= [0,1,2] ->0
// 0,"",3  - first call

    // 0   ----- 9
    //"0"  -> 1,"0",2
            /// "01"  ->     2,"01",1
                           // 012  ->  3 ,"012" ,0

                            // 013.....
                            // .019

            /// "02" ...
            // ..9



    //"1"



    //2


    //3...
    //
    //
    // .9



    public static void helpPrintIncNumbers(int i,String ans,int n){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }

        for(int j=i;j<=9;j++){ //9
            System.out.println();
            String str=ans+ Integer.toString(j);
            helpPrintIncNumbers(j+1,str,n-1);
        }
    }

    public static  void printIncNumbers(int n) {
        helpPrintIncNumbers(0, "", n);
    }
        // print all n digit increasing numbers
        // n=2
        // 01 02 03 04 05 ..09 10 -99

        // 01 02 03 04 05 06 07 08 09
        // 12 13 14 15 16 17 18 19
        // 23 24 25 26 27 28 29
        // 34 35 36 37 38 39
        // 45 46 47 48 49
        // 56 57 58 59
        // 67 68 69
        // 78 79
        // 89

        // 012 013 014...019


        //>789



        // -> -> ->

        // 456..


        // 79   7<9
        // 58
        // 91

        // left to right

        // recursion



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //printIncNumbers(n);
        helpPrintIncNumbers(0, "", n);
    }
}