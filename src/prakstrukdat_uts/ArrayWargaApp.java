
package prakstrukdat_uts;

public class ArrayWargaApp {
    public static void main(String[] args) {
        ArrayWarga arrayWarga = new ArrayWarga(10);
        
        arrayWarga.tambah("Fahrendra", 4, "Desa Pakisan", 13);
        arrayWarga.tambah("Khoirul", 3, "Desa Pakisan", 14);
        arrayWarga.tambah("Ihtada", 6, "Desa Pakisan", 15);
        arrayWarga.tambah("Bhisma", 4, "Desa Pakisan", 2);
        arrayWarga.tambah("Fazlur", 7, "Desa Pakisan", 5);
        arrayWarga.tambah("Ghozi", 2, "Desa Pakisan", 1);
        arrayWarga.tambah("Farhan", 5, "Desa Pakisan", 7);
        
        System.out.println("Data Warga:");
        arrayWarga.displayArray();
        
        System.out.print("\n\n");
        
        System.out.println("--Menambahkan Data Warga--");
        arrayWarga.tambah("Puthut", 5, "Desa Pakisan", 8);
        arrayWarga.tambah("Afrell", 5, "Desa Pakisan", 10);
        arrayWarga.displayArray();
        
        System.out.print("\n\n");
        
        System.out.println("--Menambahkan Data Warga Duplikat--");
        arrayWarga.tambah("Ihtada", 6, "Desa Pakisan", 15);
        arrayWarga.tambah("Bhisma", 4, "Desa Pakisan", 2);
        arrayWarga.tambah("Fazlur", 7, "Desa Pakisan", 5);
        
        System.out.print("\n\n");
        
        System.out.println("--Pengurutan Data Warga--");
        arrayWarga.bubbleSort();
        arrayWarga.displayArray();
        
        System.out.print("\n\n");
        
        System.out.println("--Jumlah Warga Desa Pakisan  --");
        System.out.println("Jumlah warga desa pakisan adalah " 
                + arrayWarga.rekursifJumlahWarga(arrayWarga.getnElemen()-1));
        
    }
 
}
