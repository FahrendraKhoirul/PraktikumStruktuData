
package prakstrukdat_m4_linkedlist;

public class StackLinkedList {
    private StackLink top;
    
    StackLinkedList(){
        top = null;
    }
     
    public void push(int id, String nama){
        if(top == null){
            top = new StackLink(id, nama);
            top.next = null;
            top.prev = null;
        }else{
            StackLink newStack = new StackLink(id, nama);
            newStack.prev = top;
            top.next = newStack;
            top = newStack;          
        }
    }
        
    public void pop(){
        top = top.prev;
        top.next = null;
    }
    
    public void displayStackLinkedList(){
        System.out.println("Stack (top -> bottom): ");
        StackLink current = top;
        
        while(current != null){
            current.displayStackLink();
            current = current.prev;
        }
    }
}
