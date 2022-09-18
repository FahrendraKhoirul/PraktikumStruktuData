
package prakstrukdat_m8_hashtable;


public class HashTableApp {
    public static void main(String[] args) {
        HashTable ht = new HashTable(15);
        ht.insert(13);
        ht.insert(9);
        ht.insert(8);
        ht.insert(56);
        ht.insert(24);
        ht.insert(14);
        ht.insert(1);
        ht.insert(20);
        ht.insert(17);
        ht.insert(46);
        ht.displayTable();
    }
}
