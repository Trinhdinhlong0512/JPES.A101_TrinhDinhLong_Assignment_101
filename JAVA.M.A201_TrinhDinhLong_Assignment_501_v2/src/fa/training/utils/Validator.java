package fa.training.utils;

public class Validator {
    public static boolean isValidCourseCode(String courseCode) {
        // Kiểm tra mã khóa học có đúng định dạng "FWxxx" hay không
        return courseCode.matches("FW\\d{3}");
    }

    public static boolean isValidCourseName(String courseName) {
        // Kiểm tra tên khóa học không trống
        return !courseName.isEmpty();
    }

    public static boolean isValidDuration(double duration) {
        // Kiểm tra thời lượng không âm
        return duration >= 0;
    }

    public static boolean isValidStatus(String status) {
        // Kiểm tra trạng thái có giá trị hợp lệ
        return status.equalsIgnoreCase("active") || status.equalsIgnoreCase("in-active");
    }

    public static boolean isValidFlag(String flag) {
        // Kiểm tra cờ có giá trị hợp lệ
        return flag.equalsIgnoreCase("optional") || flag.equalsIgnoreCase("mandatory") || flag.equalsIgnoreCase("N/A");
    }
}
