package PRAKTIKUM_ASD.praktikum12;
import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedLinkedList04 sll = new SingleLinkedLinkedList04();

    
    Mahasiswa04 mhs1 = new Mahasiswa04("22212201", "Ani", "3A", 3.7);
    Mahasiswa04 mhs2 = new Mahasiswa04("22212202", "Cintia", "3C", 3.5);
    Mahasiswa04 mhs3 = new Mahasiswa04("23212201", "Bimon", "2B", 3.8);
    Mahasiswa04 mhs4 = new Mahasiswa04("23212205", "Dodi", "2B", 3.9);
        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println();

        // Mencari indeks mahasiswa bernama Bimon
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();


        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    
}
}   