package PRAKTIKUM_ASD.Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo04 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah array: ");
    int jumlahMatkul = Integer.parseInt(sc.nextLine());
    Matakuliah04[] arrayOfMatakuliah04 = new Matakuliah04[jumlahMatkul];
   

    for (int i=0; i < jumlahMatkul; i++){
        System.out.println("Masukkan Data Matakuliah ke-" + (i +1));
        arrayOfMatakuliah04[i] = new Matakuliah04();
        arrayOfMatakuliah04[i].tambahdata();
         System.out.println("================================");

    }
    for (int i=0; i < jumlahMatkul; i++){
    System.out.println("Data Matakuliah ke-1" + (i+1));
    arrayOfMatakuliah04[i].cetakInfo();
    }
   } 
}
