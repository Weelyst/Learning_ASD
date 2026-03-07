package PRAKTIKUM_ASD.Praktikum03;

public class Matakuliahcnth {
    public String kode, nama;
    public int sks, jumlahJam;

    public Matakuliahcnth() {
    }

    public Matakuliahcnth(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public Matakuliahcnth(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}