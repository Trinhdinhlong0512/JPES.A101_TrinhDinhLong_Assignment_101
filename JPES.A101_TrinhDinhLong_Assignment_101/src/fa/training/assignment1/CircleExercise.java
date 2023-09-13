package fa.training.assignment1;
import java.util.Scanner;
public class CircleExercise {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính từ người dùng
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Đóng đối tượng Scanner sau khi đã sử dụng xong
        scanner.close();

        // Tính chu vi và diện tích
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Hiển thị kết quả
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
