/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bantutemen;

class Linkasda{
    public String nama;
    public Link next;
    public Link prev;
    
    public Link(String nama){
        this.nama = nama;
    }
    
    public void displayLink(){
        System.out.println(nama);
    }
    
    
}

class LinkStack { 
    //private final int maxSize; 
    Link top; 
    
    public LinkStack() { 
        //maxSize = size; 
        top = null; 
    } 
 
    public void push(String nama) { 
        if(top == null){
            top = new Link(nama);
            top.next = null;
            top.prev = null;
        }else{
            Link newStack = new Link(nama);
            newStack.prev = top;
            top.next = newStack;
            top = newStack;          
        }
    } 
 
    public String pop() { 
        Link temp = top;
        top = top.prev;
        //top.next = null;
        return temp.nama;
    } 
 
    public boolean isEmpty() { 
        return (top == null); 
    } 

}


    
