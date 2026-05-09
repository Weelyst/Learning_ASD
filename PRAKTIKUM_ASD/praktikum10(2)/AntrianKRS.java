public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalDilayani = 0;
    final int KAPASITAS_DPA = 30;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean IsEmpty() { return size == 0; }
    public boolean IsFull() { return size == max; }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
        }
    }

    public void layaniKRS() {
        if (size < 2) {
            System.out.println("Panggilan minimal membutuhkan 2 mahasiswa di antrian.");
        } else {
            System.out.println("Memproses KRS untuk 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa m = data[front];
                System.out.print("Diproses: ");
                m.tampilkanData();
                front = (front + 1) % max;
                size--;
                totalDilayani++;
            }
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        for (int i = 0; i < size; i++) {
            data[(front + i) % max].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (size < 2) {
            System.out.println("Mahasiswa di antrian kurang dari 2.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian paling akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void cetakStatistik() {
        System.out.println("Jumlah antrian saat ini: " + size);
        System.out.println("Total mahasiswa sudah KRS: " + totalDilayani);
        System.out.println("Sisa kuota mahasiswa DPA (Belum KRS): " + (KAPASITAS_DPA - totalDilayani));
    }
}