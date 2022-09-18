
package prakstrukdat_m1;

public class DataArrayApp {
    public static void main(String[] a){
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(5110124, "Fahrendra", "Bondowoso");
        arr.insert(5110126, "Ghozi", "Bondowoso");
        arr.insert(5110127, "Farhan", "Tulungagung");
        arr.insert(5110125, "Fazlur", "Bondowoso");
        arr.insert(5110129, "Afrel", "Malang");
        arr.insert(5110130, "Bhisma", "Tapen");
        arr.insert(5110128, "Puthut", "Klaten");
        
        
        
        System.out.println("Data Mahasiswa sebelum diurutkan");
        arr.displayArray();
        System.out.println();
        
        System.out.println();
        System.out.println("Data Mahasiswa setelah di BubbleSort by NIM");
        arr.bubbleSort();
        arr.displayArray();
        System.out.println();
        
        System.out.println();
        System.out.println("Data Mahasiswa setelah di SelectionSort by ASAL");
        arr.SelectionSort();
        arr.displayArray();
        System.out.println();
        
        System.out.println();
        System.out.println("Data Mahasiswa setelah di Insertion by NAMA");
        arr.InsertionSortByName();
        arr.displayArray();
        
//        long searchKey = 5110126;
//        Mahasiswa mhs;
//        mhs = arr.find(searchKey);
//        if(mhs != null){
//            System.out.print("\nketemu");
//            mhs.displayMhs();
//        }else{
//            System.out.println("ga ketemu" + searchKey);
//        }
//        
//        searchKey = 5110124;
//        System.out.println("\nhapus nim: " +searchKey);
//        arr.delete(searchKey);
//        
//        arr.displayArray();

        
  
    }
}
