public class Dosen04 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen04(){

    }
    public Dosen04 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;

    }

    void tampilInformasi(){
        System.out.println("ID Dosen        =" + idDosen);
        System.out.println("Nama            =" + nama);
        System.out.println("Status Aktif    =" + statusAktif);
        System.out.println("Tahun Bergabung =" + tahunBergabung);
        System.out.println("Bidang Keahlian =" + bidangKeahlian);

    }

    void setStatusAktif(boolean status){
        this.statusAktif = status;
        System.out.println("Status Aktif" + nama +(statusAktif ? "Aktif" : "Tidak Aktif"));

    }
    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        this.bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian" + nama + "Adalah =" + bidang);
    }

    
}
