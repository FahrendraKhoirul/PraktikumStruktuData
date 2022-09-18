
package prakstrukdat_m4_linkedlist;

public class StackLinkedListApp {

    
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1, "Buku");
        stack.push(2, "Pensil");
        stack.push(3, "Penghapus");
        stack.push(4, "Laptop");
        stack.push(5, "Handphone");
        stack.displayStackLinkedList();
        
        System.out.println();
        
        stack.pop();
        stack.pop();
        stack.displayStackLinkedList();
        System.out.println();
        
        stack.push(6, "Meja");
        stack.push(7, "Kertas");
        stack.displayStackLinkedList();
    }
}
