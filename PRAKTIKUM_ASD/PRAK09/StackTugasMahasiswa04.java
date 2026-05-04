public class StackTugasMahasiswa04 {
    Mahasiswa04[] stack;
    int size, top;

    public StackTugasMahasiswa04(int size) {
        this.size = size;
        stack = new Mahasiswa04[size];
        top = -1;
    }

    public boolean isFull() { return top == size - 1; }
    public boolean isEmpty() { return top == -1; }

    public Mahasiswa04 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public int hitungBanyakTugas() {
        return top + 1; 
    }

    public void push(Mahasiswa04 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Mahasiswa04 pop() {
        if (!isEmpty()) return stack[top--];
        return null;
    }

    public Mahasiswa04 peek() {
        return (!isEmpty()) ? stack[top] : null;
    }

    public void print() {
        for (int i = top; i >= 0; i--) { // Perbaikan urutan cetak (Pertanyaan 1)
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi04 stackBiner = new StackKonversi04();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackBiner.push(sisa);
            nilai = nilai / 2;
        }
        String biner = "";
        while (!stackBiner.isEmpty()) {
            biner += stackBiner.pop();
        }
        return biner;
    }
}