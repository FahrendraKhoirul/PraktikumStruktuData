
package prakstrukdat_m7_binarytree;


public class Node {
    int id;
    String data;
    Node leftChild;
    Node rightChild;
    
    public void displayNode(){
        System.out.print("{" + id + ", " + data + "}"); 
    }
}
