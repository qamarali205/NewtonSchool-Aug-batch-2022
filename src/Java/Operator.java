class Operator{
    public static void main(String[] args){
        //left shift operator 
        System.out.println(20<<2);//20*2^2; 20*4=80
        System.out.println(20<<3);//20*2^3; 20*8=160
        // right shift operator
        System.out.println(20>>2);//20/2^2; 20/4=5;
        System.out.println(20>>3);//20/2^3; 20/8=2; only int part

        // java tenary operator
        int a=10;
        int b=15;
        int min=(a>b)?a:b;
        System.out.println(min); //condition false print second value in tenary operator
        int max=(a<b)?a:b;
        System.out.println(max); //condition true print first value in tenary operator


        // asisgenmet operator

        a+=4;//a=a+4;
        b-=4;// b=b-4;
        System.out.println(a);
        System.out.println(b);


    }
}