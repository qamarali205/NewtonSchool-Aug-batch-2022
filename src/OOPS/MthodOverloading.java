public class MthodOverloading {


    public void hello(){

    }

    public void hello(int a){

    }

//    public int  hello(int a){
//        return 5;
//    }

    public void hello(int a,String b){

    }

    public void hello(String a,String b){

    }

    public int multiply(int a,int b){
      return a*b;
    }


    public int multiply(int a,int b,int c){
        return a*b*c;
    }


    public float multiply(float a,float b,float c){
        return a*b*c;
    }


    public static void main(String[] args) {
        MthodOverloading obj=new MthodOverloading();
    }
}