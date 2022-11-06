public class MethodOverriding { //parent

    public void printMe(int a){
        System.out.println(a*5); /// x
    }

}

class Childd extends MethodOverriding{ //child
    public void printMe(int a){
        System.out.println(a*10); //y
    }
}

class Main9{
    public static void main(String[] args) {
        Childd obj=new Childd();
        obj.printMe(5);
    }
}

// child obj
// obj.printMe(5)-> 50