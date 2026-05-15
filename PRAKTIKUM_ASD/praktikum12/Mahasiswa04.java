package PRAKTIKUM_ASD.praktikum12;

public class Mahasiswa04 {
    String nim, nama, kelas ;
    Double ipk;

    public Mahasiswa04(){

    }
    public Mahasiswa04(String nm, String name, String kls, Double ip){
       this.nim = nm;
       this.nama = name;
       this.kelas = kls;
       this.ipk = ip;


    }
    public void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}
