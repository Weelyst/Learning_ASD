import java.util.Scanner;

public class SuratDemo04 {
    public static void main(String[] args) {
        StackSurat04 tumpukan = new StackSurat04(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n--- Menu Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat (Pop)");
            System.out.println("3. Lihat Surat Terakhir (Peek)");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis (S/I): "); char jns = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    tumpukan.push(new Surat04(id, nama, kls, jns, dur));
                    break;
                case 2:
                    Surat04 p = tumpukan.pop();
                    if (p != null) System.out.println("Surat " + p.namaMahasiswa + " diproses.");
                    break;
                case 3:
                    Surat04 t = tumpukan.peek();
                    if (t != null) System.out.println("Surat teratas: " + t.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    tumpukan.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);
    }
}