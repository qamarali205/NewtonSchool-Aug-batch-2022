class AdderII implements Adder{
    public int num1;
    public int num2;
    public AdderII(){
        this.num1=0;
        this.num2=0;
    }
    public AdderII(int a, int b){
        this.num1=a;
        this.num2=b;
    }
    public int add(int a, int b, int c){
     num1 = add(num1,a);
     num2 = add(num2,b);
   
   return num1 + num2 - c*c;

}
    public int add(){
        return num1+num2;
    }
    public int add(int a,int b){
        return (a*a)+(b*b);
    }

}