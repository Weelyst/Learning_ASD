public class Mahasiswa04{
    String nim, nama, kelas;
    double ipk;

    Mahasiswa04(){
    }

    Mahasiswa04(String nm, String nma, String klas, double ip){
        nim = nm;
        nama = nma;
        kelas = klas;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
