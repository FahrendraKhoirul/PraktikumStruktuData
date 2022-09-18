/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bantutemen;

public class Link {
    public String nama, alamat;
    public int jmlh;
    public Link next;
    public Link previous;
    
    public Link(String nama, String alamat, int jmlh){
        this.nama = nama;
        this.alamat = alamat;
        this.jmlh = jmlh;
    }

    public void displayLink(){
        System.out.println("Kepala keluarga : "+nama+", jumlah anggota : "
        +jmlh+", alamat : "+alamat);
    }

    public String getNama() {
        return nama;
    }
}
