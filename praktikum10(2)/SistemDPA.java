import java.util.Scanner;

public class SistemDPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10); // Maksimal 10 sesuai soal
        int pilih;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KRS DPA ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian (Proses 2 Mhs)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Statistik & Jumlah Belum KRS");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2: antrian.layaniKRS(); break;
                case 3: antrian.tampilkanSemua(); break;
                case 4: antrian.lihatDuaTerdepan(); break;
                case 5: antrian.lihatAkhir(); break;
                case 6: antrian.cetakStatistik(); break;
                case 7: antrian.clear(); break;
            }
        } while (pilih != 0);
    }
}