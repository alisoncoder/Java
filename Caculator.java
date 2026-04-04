class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
class MyCalculator extends Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
}
public class Caculator {

    public static void main(String[] args) {

        MyCalculator calc = new MyCalculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
    }
}

