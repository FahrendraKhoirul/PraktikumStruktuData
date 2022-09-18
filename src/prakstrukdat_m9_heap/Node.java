/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakstrukdat_m9_heap;

public class Node {
    private int data;
    
    public Node(int data){
        this.data= data;
    }
    
    public int getKey(){
        return data;
    }
    
    public void setKey(int id){
        data = id;
    }
}
