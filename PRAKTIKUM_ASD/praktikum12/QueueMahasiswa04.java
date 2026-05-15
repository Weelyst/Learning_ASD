package PRAKTIKUM_ASD.praktikum12;
public class QueueMahasiswa04 {
    Node04 front, rear;
    int size;

    public QueueMahasiswa04() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // d. Cek antrian penuh (Pada Linked List secara teoritis tidak terbatas)
    public boolean isFull() {
        return false; 
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa04 input) {
        Node04 newNode = new Node04(input, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
        } else {
            System.out.print("Memanggil mahasiswa: ");
            front.data.tampilInformasi();
            System.out.println();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.print("Paling Depan: ");
            front.data.tampilInformasi();
            System.out.print("\nPaling Belakang: ");
            rear.data.tampilInformasi();
            System.out.println();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah mahasiswa dalam antrian: " + size);
            Node04 temp = front;
            int i = 1;
            while (temp != null) {
                System.out.print(i + ". ");
                temp.data.tampilInformasi();
                System.out.println();
                temp = temp.next;
                i++;
            }
        }
    }
}