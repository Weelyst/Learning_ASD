public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    public Buku(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    public void tampilBuku() {
        System.out.printf("Kode: %-5s | Judul: %-15s | Tahun: %d\n", kodeBuku, judul, tahunTerbit);
    }
}