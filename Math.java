import MathOperations.FloorOperation;
import MathOperations.CeilOperation;
import MathOperations.RoundOperation;

public class Math {
    public static void main(String[] args) {
        double[] numbers = {4.3, 5.7, -2.6, -3.5, 9.0};

        for (double num : numbers) {
            System.out.println("Number: " + num);
            System.out.println("Floor: " + FloorOperation.floor(num));
            System.out.println("Ceil: " + CeilOperation.ceil(num));
            System.out.println("Round: " + RoundOperation.round(num));
            System.out.println("----------");
        }
    }
}
