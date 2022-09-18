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

public class Arrays {
    public static void main(String[] args) {
        DoublyLinkedList a = new DoublyLinkedList();
        
        a.insert("Ali", 4, "Jl. D Belayan no 12");
        a.insert("Ahmad", 2, "Jl. D Belayan no 9");
        a.insert("Abdurrohman", 3, "Jl. D Belayan no 7");
        a.insert("Burhan", 4, "Jl. D Belayan no 6");
        a.insert("Baktiyar", 5, "Jl. D Belayan no 10");
        a.insert("Sofyan", 1, "Jl. D Belayan no 11");
        a.displayList();
        System.out.println("--tambah nama yang sudah ada--");
        a.insert("Sofyan", 1, "Jl. D Belayan no 11");
        
        System.out.println("\n--tambah--");
        a.insert("Choirul", 6, "Jl. D Belayan no 13");
        a.insert("Sujatmoko", 3, "Jl. D Belayan no 15");
        a.insert("Galuh", 2, "Jl. D Belayan no 14");
        a.insert("Hari", 4, "Jl. D Belayan no 8");
        a.displayList();
        System.out.println("--pencarian--");
        a.find("Aris");
        a.find("Burhan");
        
        
    }
}