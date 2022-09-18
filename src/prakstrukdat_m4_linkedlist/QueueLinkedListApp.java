
package prakstrukdat_m4_linkedlist;

public class QueueLinkedListApp {

    
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.insert("200605110124", "Rendra");
        queue.insert("200605110125", "Fazlur");
        queue.insert("200605110126", "Ghozi");
        queue.insert("200605110127", "Farhan");
        queue.insert("200605110128", "Puthut");
        queue.displayStackLinkedList();
        
        System.out.println();
        
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.displayStackLinkedList();
        
        System.out.println();
        
        queue.insert("200605110129", "Bhisma");
        queue.insert("200605110130", "Afrell");
        queue.insert("200605110131", "Agung");
        queue.displayStackLinkedList();
        
        
    }
}
