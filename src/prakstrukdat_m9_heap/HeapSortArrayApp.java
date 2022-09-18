/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakstrukdat_m9_heap;

import java.util.Scanner;

public class HeapSortArrayApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of item: ");
        int size = input.nextInt();
        
        Heap2 h = new Heap2(size);
        for(int j = 0; j < size; j++){
            int random = (int) (Math.random()*100);
            Node newNode = new Node(random);
            h.insertAt(j, newNode);
            h.incrementSize();
        }
    
      
        
        //Sort
        h.displayArray();
        h.HeapSort();
        h.displayArray();
        
   
       
     
        
    }
}

