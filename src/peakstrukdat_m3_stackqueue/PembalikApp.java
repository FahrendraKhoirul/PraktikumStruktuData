
package peakstrukdat_m3_stackqueue;

import java.util.Scanner;

public class PembalikApp {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  kata;
        
        int a =0;
        while(a==0){
            System.out.print("Masukkan Kata  : ");
            kata = in.nextLine();
            Pembalik pembalik = new Pembalik(kata);
            System.out.print("kebalikan Kata : " + pembalik.Hasil());
            System.out.println();
        }
    }
}
