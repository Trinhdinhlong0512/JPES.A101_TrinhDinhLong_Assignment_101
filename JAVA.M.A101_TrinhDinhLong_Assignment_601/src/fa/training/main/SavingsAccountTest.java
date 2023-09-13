package fa.training.main;
import fa.training.entities.SavingsAccount;
public class SavingsAccountTest {
    public static void main(String[] args) {
        // Đặt lãi suất hàng năm là 4%
        SavingsAccount Person1 = new SavingsAccount(0.04, 2000.0);
        SavingsAccount Person2 = new SavingsAccount(0.04,3000.0);
        // Tính và in ra lãi hàng tháng và số dư mới cho cả hai người gửi tiền
        Person1.calculateMonthlyInterest();
        Person2.calculateMonthlyInterest();
        System.out.println("Số dư của Saver 1 sau 1 tháng: $" + Person1.GetsavingsBalance());
        System.out.println("Số dư của Saver 2 sau 1 tháng: $" + Person2.GetsavingsBalance());
        // Đặt lãi suất hàng năm là 5%
        Person1.SetAnnualInterestRate(0.05);
        Person2.SetAnnualInterestRate(0.05);
        // Tính và in ra lãi hàng tháng và số dư mới cho cả hai người gửi tiền
        Person1.calculateMonthlyInterest();
        Person2.calculateMonthlyInterest();
        System.out.println("Số dư của Saver 1 sau 2 tháng: $" + Person1.GetsavingsBalance());
        System.out.println("Số dư của Saver 2 sau 2 tháng: $" + Person2.GetsavingsBalance());
    }
}
