
public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam, terlambat, denda;
    final int BATAS_PINJAM = 5; // Ketentuan jobsheet

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > BATAS_PINJAM) {
            terlambat = lamaPinjam - BATAS_PINJAM;
            denda = terlambat * 2000; // Denda Rp 2.000/hari
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.printf("%-8s | %-12s | Lama: %d | Terlambat: %d | Denda: %d\n", 
            mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}