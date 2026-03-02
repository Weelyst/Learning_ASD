public class Matakuliah04 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public Matakuliah04(){

    }
    public Matakuliah04(String kodeMK,String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }

    public void tampilInformasi(){
System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    public void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("SKS " + nama + "telah berubah menjadi " + sksBaru);

    }

    public void tambahJam(int Jam){
        this.jumlahJam += Jam;
        System.out.println("Jam " + nama + "berhasil ditambah. Total Jam = " + jumlahJam);
    }
    public void kurangiJam(int Jam){
        if (this.jumlahJam >= Jam){
            this.jumlahJam -= Jam;
            System.out.println("Jam " + nama + "Berhasil Dikurangi. Sisa Jam = " + jumlahJam);
        } else {
            System.out.println("ERROR! Jumlah jam " + nama + "Tidak mencukupi");
        }
    }
}