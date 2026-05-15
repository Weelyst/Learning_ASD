package Teori_ASD.meet11;

public class Linkedlist {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Contoh pengerjaan awal:
        list.addLast(4); 
        list.addFirst(2); 

        list.printList(); 
    }

    Node head;
    public void addFirst (int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast (int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void deleteFirst(){
        if (head != null){
            head = head.next;

        }
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
