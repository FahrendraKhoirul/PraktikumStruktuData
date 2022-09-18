
package prakstrukdat_m9_heap;


public class HeapSortArray {
    
    private Node[] heapArray;
    private int maxSize;
    int currentSize;
    int last;
    
    public HeapSortArray(int size){
        maxSize = size;
        currentSize =0;
        last =0;
        heapArray = new Node[size];
    }
    
    public boolean isEmpty(){
        return currentSize == 0;
    }
    
    public void insert(int index, Node value ){
        heapArray[index] = value;
        currentSize++;
        last++;
    }
   
    private void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while(index < currentSize /2){
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            
            if(rightChild < currentSize && heapArray[leftChild].getKey() <
                    heapArray[rightChild].getKey()){
                largerChild = rightChild;
            }else{
                largerChild = leftChild;
            }
            
            if(top.getKey() >= heapArray[largerChild].getKey()){
                break;
            }
            
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }
    
    public void displayHeap(){
        System.out.println("Heap Array: ");
        for(int i = 0; i < currentSize; i++){
            if(heapArray[i] != null){
                System.out.print(heapArray[i].getKey() + " ");
            }else{
                System.out.println("--");
            }
        }
        System.out.println("");
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = ".............................";
        System.out.println(dots + dots);
        while(currentSize > 0 ){
            if(column == 0){
                for(int k =0; k<nBlanks; k++){
                    System.out.print(" ");
                }
            }
            System.out.print(heapArray[j].getKey());
            if(++j == currentSize){
                break;
            }
            if(++column == itemsPerRow){
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            }else{
                for(int k = 0;k<nBlanks * 2 - 2; k++){
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n" + dots + dots);
    }
    
    public void displayArray(){
        for(int j = 0; j<maxSize; j++){
            System.out.print(heapArray[j].getKey() + " ");
        }
        System.out.println("");
    }
    
    public Node remove(){
        Node root = heapArray[0];
        heapArray[0]=heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    
    public void HeapSorting(){
        //trickle down
        
        for (int j = last / 2 - 1; j >= 0; j--) {
            trickleDown(j);
        }
        
        
        for(int j=currentSize-1; j>=0; j--){
           Node temp= remove();
//           heapArray[j] = temp;
        }
        
        //displayHeap();
    }
}
