package PRAKTIKUM_ASD.Praktikum03;
 import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] arrayOfMahasiswa04 = new Mahasiswa04[3];

    arrayOfMahasiswa04[0] = new Mahasiswa04();
    arrayOfMahasiswa04[0].nim = "22233";
    arrayOfMahasiswa04[0].nama = "Ahmad";
    arrayOfMahasiswa04[0].kelas = "TI-1J";
    arrayOfMahasiswa04[0].ipk = (float) 3.75;

        arrayOfMahasiswa04[1] = new Mahasiswa04();
    arrayOfMahasiswa04[1].nim = "22333";
    arrayOfMahasiswa04[1].nama = "Sirna";
    arrayOfMahasiswa04[1].kelas = "SIB-2B";
    arrayOfMahasiswa04[1].ipk = (float) 3.75;

        arrayOfMahasiswa04[2] = new Mahasiswa04();
    arrayOfMahasiswa04[2].nim = "44777";
    arrayOfMahasiswa04[2].nama = "Dera";
    arrayOfMahasiswa04[2].kelas = "TI-2I";
    arrayOfMahasiswa04[2].ipk = (float) 3.75;
System.out.println(" SPACE ");
System.out.println ("NIM:  :" + arrayOfMahasiswa04[0].nim);
System.out.println ("NAMA  :" + arrayOfMahasiswa04[0].nama);
System.out.println ("KELAS :" + arrayOfMahasiswa04[0].kelas);
System.out.println ("IPK   :" + arrayOfMahasiswa04[0].ipk);
System.out.println("-----------------------------------------");
System.out.println ("NIM   :" + arrayOfMahasiswa04[1].nim);
System.out.println ("NAMA  :" + arrayOfMahasiswa04[1].nama);
System.out.println ("KELAS :" + arrayOfMahasiswa04[1].kelas);
System.out.println ("IPK   :" + arrayOfMahasiswa04[1].ipk);
System.out.println("-----------------------------------------");
System.out.println ("NIM   :" + arrayOfMahasiswa04[2].nim);
System.out.println ("NAMA  :" + arrayOfMahasiswa04[2].nama);
System.out.println ("KELAS :" + arrayOfMahasiswa04[2].kelas);
System.out.println ("IPK   :" + arrayOfMahasiswa04[2].ipk);

    }
}