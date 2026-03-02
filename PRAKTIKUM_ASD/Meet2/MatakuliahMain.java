public class MatakuliahMain {
    public static void main(String[] args) {
        Matakuliah04 mk1 = new Matakuliah04("ALSD01", " Algoritma dan Struktur Data", 3, 6 );

        Matakuliah04 mk2 = new Matakuliah04();
        mk2.kodeMK = "BASD02";
        mk2.nama = "Basis Data";
        mk2.sks = 2;
        mk2.jumlahJam = 4;

        System.out.println(" Data Matkul 1");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        mk2.kurangiJam(10);
        System.out.println( "Info Akhir ");
        mk1.tampilInformasi();
        mk2.tampilInformasi();


    }
}
