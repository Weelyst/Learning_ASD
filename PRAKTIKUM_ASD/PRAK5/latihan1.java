package PRAKTIKUM_ASD.PRAK5;

package PRAKTIKUM_ASD.PRAK5;

class Mahasiswa {
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, int nim, int tahun, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

}

class NilaiAlgoritma {
    
 
    int cariMaxUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int kiri = cariMaxUTS(mhs, l, mid);
        int kanan = cariMaxUTS(mhs, mid + 1, r);
        return (kiri > kanan) ? kiri : kanan;
    }

  
    int cariMinUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int kiri = cariMinUTS(mhs, l, mid);
        int kanan = cariMinUTS(mhs, mid + 1, r);
        return (kiri < kanan) ? kiri : kanan;
    }

  
    double hitungRataUAS(Mahasiswa[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}