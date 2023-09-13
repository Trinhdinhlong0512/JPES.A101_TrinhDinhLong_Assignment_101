import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = scanner.nextInt();

        System.out.print("Input five number: ");
        int num5 = scanner.nextInt();

        int resultA = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum is " + resultA);
        scanner.close();
    }
}