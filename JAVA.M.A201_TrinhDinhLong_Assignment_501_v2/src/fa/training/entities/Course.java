package fa.training.entities;
import fa.training.utils.Validator;
import java.util.Scanner;

public class Course {
    private String Course_Code;
    private String Course_name;
    private Double Duration;
    private String status;
    private String flag;
    public Course(){
        this.Course_Code = null;
        this.Course_name = null;
        this.Duration = 0.0;
        this.status = null;
        this.flag = null;
    }
    public Course(String Course_Code, String Course_name, Double Duration, String status, String flag){
        this.Course_Code = Course_Code;
        this.Course_name = Course_name;
        this.Duration = Duration;
        this.status = status;
        this.flag = flag;
    }
    public String getCourse_Code(){
        return Course_Code;
    }
    public void SetCourse_Code(String course_Code){
        this.Course_Code = course_Code;
    }
    public String getCourse_name(){
        return Course_name;
    }
    public void SetCourse_name(String course_name){
        this.Course_name = course_name;
    }
    public double GetDuration(){
        return Duration;
    }
    public void SetDuration(double Duration){
        this.Duration = Duration;
    }
    public String GetStatus(){
        return status;
    }
    public void SetStatus(String status){
        this.status = status;
    }
    public String GetFlag(){
        return flag;
    }
    public void Setflag(String  flag){
        this.flag = flag;
    }
    public void Input(){
        Validator check = new Validator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course code (FWxxx): ");
        String code = scanner.nextLine();
        while (!check.isValidCourseCode(code)) {
            System.out.print("Invalid course code. Enter again (FWxxx): ");
            code = scanner.nextLine();
        }
        this.Course_Code = code;
        String name;
        System.out.print("Enter course name: ");
        name =  scanner.nextLine();
        while (!check.isValidCourseName(name)) {
            System.out.print("Invalid course code. Enter again name not null: ");
            name = scanner.nextLine();
        }
        this.Course_name = name;

        System.out.print("Enter course duration: ");
        Double duration;
        duration = scanner.nextDouble();
        while (!check.isValidDuration(duration)) {
            System.out.print("Invalid duration. Enter again: ");
            duration = scanner.nextDouble();
        }
        this.Duration = duration;

        scanner.nextLine(); // Consume the newline

        System.out.print("Enter course status (active/in-active): ");
        String status = scanner.nextLine();
        while (!check.isValidStatus(status)) {
            System.out.print("Invalid status. Enter again (active/in-active): ");
            status = scanner.nextLine();
        }
        this.status = status;

        System.out.print("Enter course flag (optional/mandatory/N/A): ");
        String flag = scanner.nextLine();
        while (!check.isValidFlag(flag)) {
            System.out.print("Invalid flag. Enter again (optional/mandatory/N/A): ");
            flag = scanner.nextLine();
        }
        this.flag = flag;
    }
    @Override
    public String toString(){
        return "Course Code: " + Course_Code + "\n" +
                "Course Name: " + Course_name + "\n" +
                "Duration: " + Duration + " hours\n" +
                "Status: " + status + "\n" +
                "Flag: " + flag;
    }
}
