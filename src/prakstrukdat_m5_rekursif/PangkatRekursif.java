
package prakstrukdat_m5_rekursif;

import java.util.Scanner;


public class PangkatRekursif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.print("Masukkan base : ");
            int a = in.nextInt();
            System.out.print("Masukkan Exponent : ");
            int b = in.nextInt();
            System.out.println(" " + a + "^" + b + " = " + pangkatRekursif(a,b));
             System.out.println();
        }   
    }
    
    public static int pangkatRekursif(int base, int exponent){
        if(exponent == 0){
            return 1;
        }else{
            return base * pangkatRekursif(base, exponent -1);
        }
    }
}
