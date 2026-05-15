package PRAKTIKUM_ASD.praktikum12;
import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueMahasiswa04 antrian = new QueueMahasiswa04();
        int pilih;

        do {
            System.out.println("\n--- SISTEM ANTRIAN UNIT KEMAHASISWAAN ---");
            System.out.println("1. Daftar Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan & Terakhir (Peek)");
            System.out.println("4. Tampilkan Seluruh Antrian & Jumlah");
            System.out.println("5. Kosongkan Antrian (Clear)");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    System.out.print("IPK: "); double ipk = sc.nextDouble();
                    antrian.enqueue(new Mahasiswa04(nim, nama, kelas, ipk));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.display();
                    break;
                case 5:
                    antrian.clear();
                    break;
            }
        } while (pilih != 6);
        
        System.out.println("Program selesai.");
    }
}