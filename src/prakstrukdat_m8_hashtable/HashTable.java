
package prakstrukdat_m8_hashtable;



public class HashTable{
    private Data[] hashArray;
    private int size;
    
    public HashTable(int size){
        this.size = size;
        hashArray = new Data[size];
    }
    
    public void displayTable(){
        System.out.println("table: ");
        for (int j=0; j<size;j++){
            if(hashArray[j] != null){
                System.out.println(" | "+j+"\t | "+hashArray[j].getKey()+" | ");
            }else{
                System.out.println(" | "+j+"\t | -- |");
            }
        }
        System.out.println("");
    }
    
    public int hashFunc1(int key){
        return key % size;
    }
    
    public void insert (int key){
        //untuk memasukkan datanya
        Data item = new Data(key);
        key = item.getKey();
        
        int hashVa1 = hashFunc1(key);
        //int i = hashVa1;
        int step = 1;
        
        while(hashArray[hashVa1] != null){
            hashVa1 = (hashVa1 + step*step)%size;
            step++;
        }
        hashArray[hashVa1] = item;
    }
    public Data delete (int key){
        int hashVa1 = hashFunc1(key);
        int i = hashVa1;
        int step = 0;
        
        while(hashArray[hashVa1] != null){
            if(hashArray[hashVa1].getKey() == key){
                Data temp = hashArray[hashVa1];
                hashArray[hashVa1]=null;
                return temp;
            }
            step++;
            int hashValue = i + step*step ;
            hashVa1 = hashValue % size;
        }
        return null;
    }
    
    public Data find(int key){
        int hashVa1 = hashFunc1(key);
        int i = hashVa1;
        int step = 0;
        while(hashArray[hashVa1] != null){
            if(hashArray[hashVa1].getKey()== key){
                return hashArray[hashVa1];
            }
            step++;
            int hashValue = i + step*step ;
            hashVa1 = hashValue % size;
        }
        return null;
    }
}