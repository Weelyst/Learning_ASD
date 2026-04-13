
public class MahasiswaBerprestasi04 {
    Mahasiswa04[] lisMhs = new Mahasiswa04[5];
    int idx;

    void tambah(Mahasiswa04 m) {
        if (idx < lisMhs.length) {
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        // Menggunakan perulangan untuk mengecek apakah elemen tidak null
        for (Mahasiswa04 m : lisMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < lisMhs.length - 1; i++) {
            for (int j = 1; j < lisMhs.length - i; j++) {
                // Syarat Descending: Jika elemen kanan > elemen kiri, maka tukar
                if (lisMhs[j].ipk > lisMhs[j - 1].ipk) {
                    Mahasiswa04 temp = lisMhs[j];
                    lisMhs[j] = lisMhs[j - 1];
                    lisMhs[j - 1] = temp;
                }
            }
        }
    }

void selectionSort() {
        for (int i = 0; i < lisMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < lisMhs.length; j++) {
                if (lisMhs[j].ipk < lisMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }

            Mahasiswa04 temp = lisMhs[idxMin];
            lisMhs[idxMin] = lisMhs[i];
            lisMhs[i] = temp;
        }
    }

    // 3. Insertion Sort (Descending - sesuai Pertukaran Praktikum 3)
    void insertionSort() {
        for (int i = 1; i < lisMhs.length; i++) {
            Mahasiswa04 temp = lisMhs[i];
            int j = i;
            // Untuk descending, gunakan operator '<'
            while (j > 0 && lisMhs[j - 1].ipk < temp.ipk) {
                lisMhs[j] = lisMhs[j - 1];
                j--;
            }
            lisMhs[j] = temp;
        }
    }
}
