/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bantutemen;

/**
 *
 * @author USER
 */
class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String nama, int jmlh, String alamat) {
        if (duplikat(nama)) {
            System.out.println(nama + " sudah ada");
        } else {
            Link newLink = new Link(nama, alamat, jmlh);
            newLink.next = first;
            first = newLink;
        }
    }

    public boolean duplikat(String id) {
        Link current = first;
        boolean dupli = false;

        if (!isEmpty()) {
            while (!current.nama.equals(id)) {
                current = current.next;
            }
            if (current.nama.equals(id)) {
                dupli = true;
            }
        }

        return dupli;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void find(String key) {

//        System.out.println("Cari " + key);
//        
//        Link firstCurrent = first;
//        Link lastCurrent = last;
//        boolean ketemu = false;
//        
//        
        if (duplikat(key)) {
            System.out.println(key + " Sudah Terdaftar");
        } else {
            System.out.println(key + " Belum Terdaftar");
        }
    }

    public void displayList() {
        System.out.println("data warga rt :");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("\n");
    }
}
