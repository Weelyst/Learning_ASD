package Praktikum03;
import java.util.Scanner;

public class DosenDemo04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jml = Integer.parseInt(sc.nextLine());
        Dosen04[] daftarDosen = new Dosen04[jml];

        // Loop FOR untuk input data
        for (int i = 0; i < jml; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W): ");
            char jkChar = sc.nextLine().toUpperCase().charAt(0);
            Boolean jk = (jkChar == 'P');
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen04(kode, nama, jk, usia);
        }

        System.out.println("\n========================================");
        System.out.println("HASIL INPUT DOSEN (FOREACH)");
        for (Dosen04 d : daftarDosen) {
            System.out.println("Dosen: " + d.nama + " [" + d.kode + "]");
        }
        DataDosen04 helper = new DataDosen04();
        helper.dataSemuaDosen(daftarDosen);
        helper.jumlahDosenPerJenisKelamin(daftarDosen);
        helper.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        helper.infoDosenPalingTua(daftarDosen);
        helper.infoDosenPalingMuda(daftarDosen);
        
        System.out.println("\n========================================");
    }
}