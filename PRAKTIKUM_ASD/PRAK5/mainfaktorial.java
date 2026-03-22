package PRAKTIKUM_ASD.PRAK5;
import java.util.Scanner;
public class mainfaktorial{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai Faktorial " + nilai + " Menngunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC: " + fk.faktorialDC(nilai));
    }
    
}
