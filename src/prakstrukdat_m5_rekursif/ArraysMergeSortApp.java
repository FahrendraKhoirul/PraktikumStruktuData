
package prakstrukdat_m5_rekursif;

public class ArraysMergeSortApp {
    public static void main(String[] args) {
        ArraysMergeSort app = new ArraysMergeSort(10);
        app.insert(100);
        app.insert(43);
        app.insert(13);
        app.insert(94);
        app.insert(23);
        app.insert(45);
        app.insert(87);
        app.insert(6);
        app.insert(12);
        app.insert(89);
        
        System.out.println("Sebelum MergeSort :");
        app.display();
        
        app.mergeSort();
        
        System.out.println("\nSesudah MergeSort :");
        app.display();
    }
}
