package PRAKTIKUM_ASD.Praktikum03;
import java.util.Scanner;

public class Matakuliah04 {
    Scanner sc = new Scanner(System.in);
    public String kode, nama;
    public int sks, jumlahJam;

    public Matakuliah04(){
        
    }
    
public void tambahdata(){
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------");

}
public void cetakInfo(){
    System.out.println("Kode : " + this.kode);
    System.out.println("Nama : " + this.nama);
    System.out.println("SKS : " + this.sks);
    System.out.println("Jumlah Jam : " + this.jumlahJam);

}
}
