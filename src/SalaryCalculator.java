import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int straightTime = 40;
        int excessHourlyRate;
        int grossPay;

        System.out.print("How many Employee: " );
        int employee = input.nextInt();

            for (int i = 1; i <= employee; i++){
                System.out.print("Enter excess hours worked employee" + i + ": ");
                int excessHourWorked = input.nextInt();

                excessHourlyRate = excessHourWorked / 2;
                grossPay = straightTime + excessHourlyRate;

                System.out.printf("Hourly rate is: %d%n", excessHourlyRate);
                System.out.printf("GrossPay rate is: %d%n", grossPay);

        }

        }
}
