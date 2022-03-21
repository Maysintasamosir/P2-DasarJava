import java.util.Scanner;
public class P_KalkulatorIf {
    public static void main(String[] args) {
        //kalkulator sederhana menggunakan percabangaan if-else if
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our kalkulator:");
        System.out.println("enter the firs number:");
        double a = input.nextDouble();
        System.out.println("enter the second number:");
        double b = input.nextDouble();
        System.out.println("choose one of the following operations:");
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-multiplication");
        System.out.println("4-devision");
        int choice = input.nextInt();
        double result = 0.0;
        if (choice == 1) {
            result = a + b;
        } else if (choice == 2) {
            result = a - b;
        } else if (choice == 3) {
            result = a * b;
        } else if (choice == 4) {
            result = a / b;
        }
        if ((choice > 0) && (choice < 5)) {
            System.out.println("result" + result);
        } else {
            System.out.println("invalid choice");
        }
        System.out.println("thank you for using our kalkulator.");

    }
}
