package PRAKTIKUM_ASD.Praktikum03;
 import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] arrayOfMahasiswa04 = new Mahasiswa04[3];
        String dummy;

        for(int i = 0; i < 3; i++){
            arrayOfMahasiswa04[i] = new Mahasiswa04();


            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM  : ");
            arrayOfMahasiswa04[i].nim = sc.nextLine();
            System.out.println("Nama : ");
            arrayOfMahasiswa04[i].nama = sc.nextLine();
            System.out.println("Kelas : ");
            arrayOfMahasiswa04[i].kelas = sc.nextLine();
            System.out.println("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa04[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");
        }
           
            for(int i = 0; i < 3; i++){
            System.out.println("DATA MAHASISWA KE- : " + (i + 1));
            System.out.println("NIM : " +arrayOfMahasiswa04[i].nim);
            System.out.println("NAMA : " +arrayOfMahasiswa04[i].nama);
            System.out.println("KELAS : " +arrayOfMahasiswa04[i].kelas);
            System.out.println("IPK : " +arrayOfMahasiswa04[i].ipk);
             System.out.println("---------------------------------");

        }

    }
}