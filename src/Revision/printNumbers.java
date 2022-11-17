import java.util.Scanner;

public class printNumbers {

    public static void printNum(int n) {
    
    for(int i = n; i >= 1; i--) { // row
    
    for (int j = 1; j <= i; j++) { // col
    
    System.out.print(j + " ");
    
    }
    
    System.out.println();
    
    }
    
    for(int i = 2; i <= n; i++) { // row
    
    for (int j = 1; j <= i; j++) { // col
    
    System.out.print(j + " ");
    
    }
    
    System.out.println();
    
    }
    
    }
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    printNum(n);
    
    }
    
    }
    
    