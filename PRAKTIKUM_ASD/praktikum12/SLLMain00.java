package PRAKTIKUM_ASD.praktikum12;
import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedLinkedList04 sll = new SingleLinkedLinkedList04();
        int pilihan;
        do {
            System.out.println("\n--- MENU MANIPULASI URUTAN NODE ---");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data)");
            System.out.println("3. Cari Data");
            System.out.println("4. Get Data");
            System.out.println("5. Cetak List");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (pilihan >= 1 && pilihan <= 4) {
                // Input data mahasiswa umum
                System.out.print("NIM   : "); String nim = sc.nextLine();
                System.out.print("Nama  : "); String nama = sc.nextLine();
                System.out.print("Kelas : "); String kelas = sc.nextLine();
                System.out.print("IPK   : "); double ipk = sc.nextDouble();
                sc.nextLine();
                Mahasiswa04 mhs = new Mahasiswa04(nim, nama, kelas, ipk);

                switch (pilihan) {
                    case 1: sll.addFirst(mhs); break;
                    case 2: sll.addLast(mhs); break;
                    case 3:
                        System.out.print("Disisipkan setelah nama siapa? ");
                        String key = sc.nextLine();
                        sll.insertAfter(key, mhs);
                        break;
                    case 4:
                        System.out.print("Masukkan indeks tujuan: ");
                        int idx = sc.nextInt();
                        sll.insertAt(idx, mhs);
                        break;
                    
                }
            } else if (pilihan == 5) {
                sll.print();
            }
        } while (pilihan != 6);
    }
}