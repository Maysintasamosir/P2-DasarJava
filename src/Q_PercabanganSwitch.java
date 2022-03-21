import java.util.Scanner;
public class Q_PercabanganSwitch {
    public static void main(String[] args) {
        //mmebuat variabel dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.println("inputkan nama warna:");
        lampu=scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.println("lampu merah,berhenti");
                break;
            case"kuning":
                System.out.println("lampu kuning, harap hati hati!");
                break;
            case "hijau":
                System.out.println("lampu hijai,silahkan jalan!");
                break;
            default:
                System.out.println("warna lampu salah!");





        }







    }
}
