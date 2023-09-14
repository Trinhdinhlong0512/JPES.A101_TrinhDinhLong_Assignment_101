package fa.training.assignment1;
import java.util.Scanner;
public class ArithmeticExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.print("Input first number: ");
        number1 = scanner.nextInt();
        System.out.print("Input second number: ");
        number2 = scanner.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }
}
