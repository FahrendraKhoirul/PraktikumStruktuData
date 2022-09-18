
package Bantutemen;

public class Node {
    long nim;
    double score;
    Node next;
    Node prev;

    public Node(long nim, double score) {
        this.nim = nim;
        this.score = score;
    }
    
    public void displayStackLink(){
        System.out.println("{"+nim+", "+score+"}");
    }
}
