
package prakstrukdat_m9_heap;


public class HeapApp {
    public static void main(String[] args) {
        Heap h = new Heap(35);
        h.insert(0);
        h.insert(3);
        h.insert(6);
        h.insert(9);
        h.insert(12);
        h.insert(11);
        h.insert(15);
        h.insert(17);
        h.insert(23);
        h.insert(34);
        h.insert(12);
        h.insert(22);
        h.displayHeap();
        h.insert(15);
        h.displayHeap();
        h.remove();
        h.displayHeap();
        h.changePriority(3, 55);
        h.displayHeap();
        
    }
}
