public class Mahasiswa {
    String nim, nama, prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.printf("NIM: %s | Nama: %-10s | Prodi: %s\n", nim, nama, prodi);
    }
}