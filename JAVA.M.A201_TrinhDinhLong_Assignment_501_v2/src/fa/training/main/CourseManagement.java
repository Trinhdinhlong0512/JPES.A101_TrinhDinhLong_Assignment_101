package fa.training.main;
import fa.training.entities.Course;
import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args){
        CourseManagement sorter = new CourseManagement();
        Scanner scanner = new Scanner(System.in);
        Course[] course = new Course[10];
        for (int i = 0; i < course.length; i++){
            System.out.println("Enter details for Course " + (i + 1) + ":");
            course[i] = new Course();
            course[i].Input();
        }
        // Search courses by an attr ibute
        System.out.print("Enter attribute name (courseCode, courseName, duration, status, flag): ");
        String attributeName = scanner.nextLine();
        System.out.print("Enter search data: ");
        String searchData = scanner.nextLine();

        sorter.searchCourseByAttribute(course, attributeName, searchData);
        System.out.print("\n");
        // Display all courses that have the flag "mandatory"
        System.out.println("Courses with 'mandatory' flag:");
        for (Course course1 : course){
            if(course1.GetFlag().equals("mandatory")){
                System.out.println(course1);
                System.out.println("--------------------------");
            }
        }
    }
    public void searchCourseByAttribute(Course[] courses, String attributeName, String searchData) {
        boolean found = false;
        for (Course course : courses) {
            switch (attributeName) {
                case "courseCode":
                    if (course.getCourse_Code().equalsIgnoreCase(searchData)) {
                        found = true;
                        System.out.println(course);
                    }
                    break;
                case "courseName":
                    if (course.getCourse_name().equalsIgnoreCase(searchData)) {
                        found = true;
                        System.out.println(course);
                    }
                    break;
                case "duration":
                    if (Double.toString(course.GetDuration()).equalsIgnoreCase(searchData)) {
                        found = true;
                        System.out.println(course);
                    }
                    break;
                case "status":
                    if (course.GetStatus().equalsIgnoreCase(searchData)) {
                        found = true;
                        System.out.println(course);
                    }
                    break;
                case "flag":
                    if (course.GetFlag().equalsIgnoreCase(searchData)) {
                        found = true;
                        System.out.println(course);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!found){
            System.out.println("No courses found with " + attributeName + " = " + searchData);
        }
    }
}

