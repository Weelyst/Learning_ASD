public class StackSurat04 {
    Surat04[] stack;
    int size, top;

    public StackSurat04(int size) {
        this.size = size;
        stack = new Surat04[size];
        top = -1;
    }

    public void push(Surat04 s) {
        if (top < size - 1) stack[++top] = s;
        else System.out.println("Stack Penuh");
    }

    public Surat04 pop() {
        return (top != -1) ? stack[top--] : null;
    }

    public Surat04 peek() {
        return (top != -1) ? stack[top] : null;
    }

    public void cariSurat(String nama) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Surat tidak ditemukan.");
    }
}