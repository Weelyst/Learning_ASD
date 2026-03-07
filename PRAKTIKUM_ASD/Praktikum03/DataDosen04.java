package Praktikum03;

public class DataDosen04 {

 public void dataSemuaDosen(Dosen04[] arrayOFDosen04){
    System.out.println("=== Data Semua Dosen ===");
    for (Dosen04 d : arrayOFDosen04){
        String jk = d.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Kode: " + d.kode + " NAMA: " 
        + d.nama + " Gender : " + jk + " Usia : " + d.usia);

    }
}
public void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen04 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, jmlPria = 0, jmlWanita = 0;
        for (Dosen04 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }
        System.out.println("\nRata-rata Usia Pria: " + (jmlPria > 0 ? (double)totalPria/jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita: " + (jmlWanita > 0 ? (double)totalWanita/jmlWanita : 0));
    }

    public void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        Dosen04 tertua = arrayOfDosen[0];
        for (Dosen04 d : arrayOfDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("\nDosen Paling Tua: " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    public void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        Dosen04 termuda = arrayOfDosen[0];
        for (Dosen04 d : arrayOfDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("Dosen Paling Muda: " + termuda.nama + " (" + termuda.usia + " tahun)");
    }
}
 