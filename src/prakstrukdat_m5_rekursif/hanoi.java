/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakstrukdat_m5_rekursif;
import java.util.Scanner;

public class hanoi{
    static int move = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Cakram/Disc: ");
        int Cakram = input.nextInt();
        hanoi (Cakram, 'A', 'B', 'C');}

    static void hanoi (int Cakram, char awal, char bantu, char tujuan){

    if (Cakram >= 1) { 
        hanoi (Cakram-1, awal, tujuan, bantu);
        move(Cakram, awal, tujuan);
        hanoi (Cakram-1, bantu, awal, tujuan);
        }
    }

    static void move (int step, char awal, char tujuan){
        System.out.print(""+move +" ");
        move++;
        System.out.print("Cakram "+step);
        System.out.print(" = "+awal);
        System.out.println(" -> "+tujuan);
    }
}