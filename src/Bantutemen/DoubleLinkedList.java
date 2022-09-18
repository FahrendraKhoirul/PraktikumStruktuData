package Bantutemen;

public class DoubleLinkedList {

    private Node last;
    private Node first;
    int banyakData;

    DoubleLinkedList() {
        last = null;
        banyakData = 0;
    }

    public void insert(long nim, double score) {
        Node temp = new Node(nim, score);
        if (first == null) {
            first = temp;
        } else {
            last.next = temp;
            temp.prev = last;
        }
        last = temp;
        banyakData++;
    }

    public void deleteKey(long key) {
        Node current = first;
        while (current.nim != key) {
            current = current.next;
            if (current == first) {
                first = current.next;
            } else {
                current.prev.next = current.next;
            }
            if (current == last) {
                last = current.prev;
            } else {
                current.next.prev = current.prev;

            }
        }
        banyakData--;

    }

    public void displayDoubleLinkedList() {
        System.out.println("DoubleLinkedList (first -> last): ");
        Node current = last;
        while (current != null) {
            current.displayStackLink();
            current = current.prev;
        }
    }
    
    public double rataRata(){
        Node current = first;
        double rataRata = 0;
        
        boolean loop = true;
        while(loop){
            rataRata = rataRata + current.score;
            if(current.next == null){
                loop = false;
            }
            current = current.next;
        }
        rataRata = rataRata / banyakData;
        return rataRata;
    }
    
    public double kuartilDua(){
        Node current = first;
        double q2;
        if(banyakData%2==1){
           for(int i=0; i<(banyakData+1)/2; i++ ){
               current = current.next;
           }
           q2 = current.score;
        }else{
            for(int i=1; i<(banyakData)/2; i++ ){
               current = current.next;
           }
            q2 = (current.score +current.next.score)/2;
        }      
        return q2;
    }
    
    public double kuartilSatu(){
        Node current = first;
        double q2;
        if(banyakData%2==1){
           for(int i=0; i<(banyakData+1)/4; i++ ){
               current = current.next;
           }
           q2 = current.score;
        }else{
            for(int i=1; i<(banyakData)/4; i++ ){
               current = current.next;
           }
            q2 = (current.score +current.next.score)/2;
        }      
        return q2;
    }
    
    public double kuartilTiga(){
        Node current = first;
        double q2;
        if(banyakData%2==1){
           for(int i=0; i<(banyakData+1)*3/4; i++ ){
               current = current.next;
           }
           q2 = current.score;
        }else{
            for(int i=1; i<(banyakData)*3/4; i++ ){
               current = current.next;
           }
            q2 = (current.score +current.next.score)/2;
        }      
        return q2;
    }
    
    public void duplikat(String id){
        Link current = first;
        boolean dupli = true;
        
        while (current.id !=  id){
            current =current.next;
            dupli = false;
        }
        
        if(dupli == true){
            System.out.print(id + " sudah ada");
        }else{
            System.out.print(id + " tidak ada");
        }
    }
}
