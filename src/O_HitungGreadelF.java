import java.util.Scanner;
public class O_HitungGreadelF {
    public static void main(String[] args) {
        //implementasi percabangan if-else if menghitung grade

        //membuat variabel dan Scanner
        int nilai;
        String grade;
        Scanner scan=new Scanner(System.in);

        //megambil input
        System.out.println("inputkan nilai:");
        nilai = scan.nextInt();

        //hitung gradenya
        if(nilai>=85){
            grade="A";
        }else if(nilai>=75){
            grade="B+";
        }else if(nilai>=65){
            grade="B";
        }else if(nilai>=60){
            grade="C+";
        }else if(nilai>=55){
            grade="C";
        }else if(nilai>=40){
            grade="D";
        }else {
            grade="E";
        }
        //cetak hasilnya
        System.out.println("Grade:"+grade);

    }
}
