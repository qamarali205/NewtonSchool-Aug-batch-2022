static int firstTwo(int N){
    //Enter your code here
    String str = Integer.toString(N);
    String str1 = "";
    str1 += str.charAt(1);
    str1 += str.charAt(0);
    int p = Integer.parseInt(str1);
    return p;
    }