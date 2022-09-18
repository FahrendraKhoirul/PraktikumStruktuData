
package peakstrukdat_m3_stackqueue;

import java.util.Scanner;

public class AntrianApp {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cmd;
        Queue que = new Queue(5);
        System.out.println("======= Command Antrian =======");
        System.out.println("   1 = input antrian");
        System.out.println("   2 = melihat isi antrian");
        System.out.println("   3 = mengosongkan antrian");
        System.out.println("===============================\n");
       
        int a =0;
        while(a ==0){
           System.out.print("\nMasukkan Command (1/2/3) : ");
           cmd = in.nextLine();
           
           if(cmd.equals("1")){
                System.out.print(">> nama : ");
                String nama = in.nextLine();
                if(!que.isFull()){
                    que.insert(nama);
                    System.out.println(nama + " masuk antrian");
                }else{
                    System.out.println("maaf "+ nama + ", antrian masih penuh");
                }
           } else if(cmd.equals("2")){
                Queue temp = new Queue(que);
                System.out.println(">> isi antrian");
                while(!temp.isEmpty()){
                    System.out.print(temp.remove() + ", ");
                }
                System.out.println();
                
           } else if(cmd.equals("3")){
                System.out.println(">> satu per satu keluar antrian");
                
                while(!que.isEmpty()){
                    System.out.println("\n"+que.peekFront() + " keluar antrian");
                    que.remove();
                    int item = 0;
                    Queue temp = new Queue(que);
                    while(!temp.isEmpty()){
                        System.out.print(temp.remove() + ", ");
                        item++;
                    }
                    for(int i=item; i<5; i++){
                        System.out.print("kosong, ");
                    }
                }
           } else {
               System.out.println("INPUT SALAH");
           }
  
        }
    }
}
