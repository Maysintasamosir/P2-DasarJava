import java.util.Scanner;
public class N_Prcabangan2If {
    public static void main(String[] args) {
        //menggunakan percabgan if lanjutan
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int intNumber=input.nextInt();
        if (intNumber > 5){
            System.out.println("the number you entered is greater than 5!");
        }
        System.out.println("thans for the input!");

        System.out.println("\nEnter a number between 10-20:");
        int a= input.nextInt();

        if (a>=10&&a<=20){
            System.out.println("the condition has been met.");
        }else {
            System.out.println("you did it wrong.");
        }
        System.out.println("\nEnter a number between 10-20 or 30-40:");
        int b= input.nextInt();
        if (((b>=10&&(b<=20)) ||((b>=30)&&(b<=40)))){
            System.out.println("the condition has been met.");
        }else {
            System.out.println("you did it wrong.");
        }
    }

}
