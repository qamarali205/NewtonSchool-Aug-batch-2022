class Calculator {
    static class InnerClass {
        void hello() {
            System.out.println("hi");
        }
    }

    static int sum;
    int num = 10;

    static int add(int a, int b) {

        return a + b;
    }

    int add(double a, double b) {
        return (int) (a + b);
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }


    int sub(int a, int b) {
        return a - b;
    }

}

public class FunctionOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sum = 10;
        Calculator.sum = 10;
        Calculator.add(10, 20);
        Calculator.InnerClass ic = new Calculator.InnerClass();
//        Calculator.num = 10;
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.5, 20.2));
        // 10 + 20 + 30
        System.out.println(calc.add(10, 20, 30));
//        int sum = calc.add(10, 20);
//        int sum2 = calc.add(sum, 30);
//        Calculator cal2 = new Calculator();
//        cal2 = null;
//        cal2.add(10,20); // null pointer ex
    }
}


// javac Main.java -> Main.class -> compile
// java Main -> runtime