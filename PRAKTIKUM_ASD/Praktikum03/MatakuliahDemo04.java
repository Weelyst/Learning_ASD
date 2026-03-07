package PRAKTIKUM_ASD.Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo04 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Matakuliah04[] arrayOfMatakuliah04 = new Matakuliah04[3];
    String kode, nama, dummy;
    int sks, jumlahJam;

    for (int i=0; i < 3; i++){
        System.out.println("Masukkan Data Matakuliah ke-" + (i +1));
        System.out.println("Kode : ");
         kode = sc.nextLine();
          System.out.println("NAMA : ");
         nama = sc.nextLine();
          System.out.println("SKS : ");
         dummy = sc.nextLine();
         sks = Integer.parseInt(dummy);
          System.out.println("Jumlah Jam : ");
         dummy = sc.nextLine();
         jumlahJam = Integer.parseInt(dummy);
         
         System.out.println("================================");

         arrayOfMatakuliah04[i] = new Matakuliah04(kode, nama, sks, jumlahJam);

    }
    
   } 
}
