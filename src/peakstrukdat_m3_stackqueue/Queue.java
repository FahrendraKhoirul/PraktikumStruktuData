
package peakstrukdat_m3_stackqueue;


public class Queue {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    
    public Queue(Queue copy){
        this.maxSize = copy.maxSize;
        this.queArray = copy.queArray;
        this.front = copy.front;
        this.rear = copy.rear;
        this.nItems= copy.nItems;
    }
    public Queue(int size){
        this.maxSize = size;
        queArray = new String[maxSize];
        front =0;
        rear =-1;
        nItems=0;
    }
    
    public void insert(String value){
        if(rear == maxSize -1){
            rear = -1;
        }
        
        queArray[++rear] = value;
        nItems++;
    }
    
    public String remove(){
        String temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        
        nItems--;
        return temp;
    }
    
    public String peekFront(){
        return queArray[front];
    }
    
    public int size(){
        return nItems;
    }
    
    public boolean isEmpty(){
        return (nItems ==0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }

    
}
