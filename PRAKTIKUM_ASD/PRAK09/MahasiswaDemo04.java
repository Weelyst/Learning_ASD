import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

       do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah (Pertama Masuk)");
            System.out.println("6. Menghitung Jumlah Tugas");               
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
               case 2:
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        
                        // BARIS TAMBAHAN UNTUK VERSI 2
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa04 lihat = stack.peek();
                    if (lihat != null) System.out.println("Tugas terakhir: " + lihat.nama);
                    break;
                case 4:
                    stack.print();
                    break;
                    case 5:
                    Mahasiswa04 bawah = stack.lihatTugasTerbawah();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh: " + bawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Banyak tugas saat ini: " + stack.hitungBanyakTugas());
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}