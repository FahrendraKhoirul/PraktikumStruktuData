
package prakstrukdat_m4_linkedlist;


public class QueueLink {
    private String nim;
    private String mahasiswa;
    QueueLink next;
    QueueLink prev;
    
    public QueueLink(String nim, String mahasiswa){
        this.nim = nim;
        this.mahasiswa = mahasiswa;
    }
    
    public void displayStackLink(){
        System.out.println("{"+nim+", "+mahasiswa+"}");
    }
}
