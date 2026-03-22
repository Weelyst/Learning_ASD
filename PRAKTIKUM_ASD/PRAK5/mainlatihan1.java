public class mainlatihan1{
     public static void main(String[] args) {
        // Inisialisasi data sesuai tabel pada Jobsheet 5
        Mahasiswa[] daftarMhs = new Mahasiswa[8];
        daftarMhs[0] = new Mahasiswa("HHER", 230001, 2022, 78, 82);
        daftarMhs[1] = new Mahasiswa("Budi", 2302, 2022, 85, 88);
        daftarMhs[2] = new Mahasiswa("Cindy", 230103, 2021, 90, 87);
        daftarMhs[3] = new Mahasiswa("DHEQ", 240104, 2021, 76, 79);
        daftarMhs[4] = new Mahasiswa("RTGA", 223105, 2023, 92, 95);
        daftarMhs[5] = new Mahasiswa("RRET", 230106, 2023, 80, 85);
        daftarMhs[6] = new Mahasiswa("HHAAS", 230107, 2022, 84, 83);
        daftarMhs[7] = new Mahasiswa("HanF", 230108, 2022, 88, 84);

        NilaiAlgoritma pengolah = new NilaiAlgoritma();

        System.out.println("========================================");
        System.out.println("=== HASIL PENGOLAHAN NILAI MAHASISWA ===");
        System.out.println("========================================");
        
        // Hasil menggunakan Divide and Conquer
        int maxUTS = pengolah.cariMaxUTS(daftarMhs, 0, daftarMhs.length - 1);
        int minUTS = pengolah.cariMinUTS(daftarMhs, 0, daftarMhs.length - 1);
        
        System.out.println("Nilai UTS Tertinggi (DC) : " + maxUTS);
        System.out.println("Nilai UTS Terendah (DC)  : " + minUTS);

        // Hasil menggunakan Brute Force
        double rataUAS = pengolah.hitungRataUAS(daftarMhs);
        System.out.printf("Rata-rata UAS (BF)       : %.2f\n", rataUAS);
        
        System.out.println("========================================");
    }
}