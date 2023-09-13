import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("radius: ");
        double radius = scanner.nextDouble();

        System.out.print("height: ");
        double height = scanner.nextDouble();

        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double baseArea = Math.PI * Math.pow(radius, 2);
        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Surface Area =  " + surfaceArea);
        System.out.println("Base Area = " + baseArea);
        System.out.println("Volume = " + volume);

        scanner.close();
    }
}