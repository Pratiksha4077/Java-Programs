import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;

public class pra6_3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}