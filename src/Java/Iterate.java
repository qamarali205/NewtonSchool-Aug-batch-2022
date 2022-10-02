// Online Java Compiler

// Use this editor to write, compile and run your Java code online

class Iterate {

static int a[] = {1,2,3,4,5};

public static void iterate(int i){

if(i==5){

return;

}

System.out.println(a[i]);

iterate(i+1);

System.out.println(a[i]);

return;

}

public static void main(String[] args) {

int a[] = {1,2,3,4,5};

iterate(0);

// for(int i = 0;i< 5;i++){

// System.out.println(a[i]);

// }

// for(int i = 4;i>=0;i--){

// System.out.println(a[i]);

// }

}

}