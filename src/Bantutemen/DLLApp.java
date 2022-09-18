
package Bantutemen;


public class DLLApp {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
    
        dll.insert(2006051101, 100.0);
        dll.insert(2006051102, 90.0);
        dll.insert(2006051103, 80.0);
        dll.insert(2006051104, 70.0);
        dll.insert(2006051105, 60.0);
        dll.insert(2006051106, 50.0);
        dll.insert(2006051107, 40.0);
        dll.insert(2006051108, 30.0);
        dll.insert(2006051109, 20.0);
        dll.insert(2006051110, 10.0);
        dll.displayDoubleLinkedList();
        
        System.out.println("Rata Rata = " + dll.rataRata());
        System.out.println("Kuartil Satu = " + dll.kuartilSatu());
        System.out.println("Kuartil Dua = " + dll.kuartilDua());
        System.out.println("Kuartil Tiga =" + dll.kuartilTiga());
    }
}
