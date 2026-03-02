public class DosenMain {
    public static void main(String[] args) {
        Dosen04 dsn1 = new Dosen04("DSN001", "Dr. Budi Santoso", true, 2015, "Kecerdasan Buatan");
        Dosen04 dsn2 = new Dosen04();
        dsn2.idDosen = "DSN002";
        dsn2.nama = "Siti Aminah, M.T.";
        dsn2.statusAktif = false;
        dsn2.tahunBergabung = 2020;
        dsn2.bidangKeahlian = "Sistem Informasi";

        System.out.println("=== Data Dosen Awal ===");
        dsn1.tampilInformasi();
        dsn2.tampilInformasi();

        System.out.println(">>> Update Data Dosen 1:");
        dsn1.ubahKeahlian("Data Science");
        int masaKerja1 = dsn1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja " + dsn1.nama + ": " + masaKerja1 + " tahun");
        System.out.println();

        System.out.println("Update Data Dosen 2:");
        dsn2.setStatusAktif(true);
        int masaKerja2 = dsn2.hitungMasaKerja(2026);
        System.out.println("Masa Kerja " + dsn2.nama + ": " + masaKerja2 + " tahun");
        System.out.println();

        System.out.println("=== Data Dosen Terbaru ===");
        dsn1.tampilInformasi();
        dsn2.tampilInformasi();
    }
}
