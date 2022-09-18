
package prakstrukdat_m4_linkedlist;


public class StackLink {
    private int id;
    private String namaBarang;
    StackLink next;
    StackLink prev;
    
    public StackLink(int id, String namaBarang){
        this.id = id;
        this.namaBarang = namaBarang;
    }
    
    public void displayStackLink(){
        System.out.println("{"+id+", "+namaBarang+"}");
    }
}
