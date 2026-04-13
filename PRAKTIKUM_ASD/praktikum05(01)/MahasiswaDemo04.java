import java.util.Scanner;
public class MahasiswaDemo04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
       int jmlMhs = 5; 

        System.out.println("--- Input Data Mahasiswa ---");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
        
            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data Mahasiswa sebulum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}

