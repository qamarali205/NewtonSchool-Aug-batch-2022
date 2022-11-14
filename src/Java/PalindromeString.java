// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class PalindromeString {
    public static boolean isPalindrome(String str){
        int n=str.length();
        
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
      String str="nnnnii";
      System.out.print(isPalindrome(str));
    }
}