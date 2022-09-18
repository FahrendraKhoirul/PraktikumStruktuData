
package prakstrukdat_m4_linkedlist;

public class QueueLinkedList {
    private QueueLink front;
    private QueueLink current;
    
    QueueLinkedList(){
        front = null;
    }
     
    public void insert(String nim, String nama){
        if(front == null){
            front = new QueueLink(nim, nama);
            front.next = null;
            front.prev = null;
            current = front;
        }else{
            QueueLink newQueue = new QueueLink(nim, nama);
            current.prev = newQueue;
            newQueue.next = front;
            current = newQueue;
        }
    }
        
    public void remove(){
        front = front.prev;
        front.next = null;
    }
    
    public void displayStackLinkedList(){
        System.out.println("Queue (front -> rear): ");
        QueueLink cek = front;
        
        while(cek != null){
            cek.displayStackLink();
            cek = cek.prev;
        }
    }
}
