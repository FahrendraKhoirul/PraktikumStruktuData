
package prakstrukdat_m6_advancedsort;

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
        System.out.println("Data Mahasiswa setelah di MergeSort by Nama");
        arr.mergeSort();
        arr.displayArray();
        System.out.println();
        
        System.out.println();
        System.out.println("Data Mahasiswa setelah di ShellSort by NIM");
        arr.shellSort();
        arr.displayArray();
        System.out.println();
        
        System.out.println();
        System.out.println("Data Mahasiswa setelah di QuickSort by NAMA");
        arr.quickSort();
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
