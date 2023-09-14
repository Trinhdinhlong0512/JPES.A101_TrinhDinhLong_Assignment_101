package fa.training.assignment1;
import java.util.Scanner;
public class RectangleExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều rộng và chiều cao từ người dùng
        System.out.print("width = ");
        double width = scanner.nextDouble();

        System.out.print("height = ");
        double height = scanner.nextDouble();

        // Đóng đối tượng Scanner sau khi đã sử dụng xong
        scanner.close();

        // Tính diện tích và chu vi
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Hiển thị kết quả
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}
