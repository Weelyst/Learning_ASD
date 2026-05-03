import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Data awal sesuai instruksi jobsheet[cite: 1]
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] daftarBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] daftarPinjam = {
            new Peminjaman(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman(daftarMhs[0], daftarBuku[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Terbesar)\n5. Cari Berdasarkan NIM\n0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    for (Mahasiswa m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    for (Buku b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    // Algoritma Sorting (Insertion Sort)[cite: 1]
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        Peminjaman temp = daftarPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPinjam[j].denda < temp.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j--;
                        }
                        daftarPinjam[j + 1] = temp;
                    }
                    System.out.println("Data Berhasil Diurutkan!");
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    // Algoritma Searching (Sequential Search)[cite: 1]
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();
                    boolean ketemu = false;
                    for (Peminjaman p : daftarPinjam) {
                        if (p.mhs.nim.equalsIgnoreCase(cari)) {
                            p.tampilPeminjaman();
                            ketemu = true;
                        }
                    }
                    if (!ketemu) System.out.println("Data NIM tidak ditemukan.");
                    break;
            }
        } while (pilih != 0);
    }
}